package com.threadCommunication.producerConsumerAllWait.entity;

public class Producer {
    private String lock;

    public Producer(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.value.equals("")) {
                    System.out.println("The producer " + Thread.currentThread().getName() + " is waiting ++");
                    lock.wait();
                }
                System.out.println("The producer " + Thread.currentThread().getName() + " is running ++");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
//                lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
