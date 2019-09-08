package com.threadCommunication.producerConsumerAllWait.entity;

public class Consumer {
    private String lock;

    public Consumer(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.value.equals("")) {
                    System.out.println("The consumer " + Thread.currentThread().getName() + " is waiting --");
                    lock.wait();
                }
                System.out.println("The consumer " + Thread.currentThread().getName() + " is running --");
                ValueObject.value = "";
//                lock.notify();
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
