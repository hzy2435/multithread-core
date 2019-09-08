package com.threadRunSync.thread;

public class MyThread extends Thread {
    private Object lock;
    private int showNumPosition;
    private String showChar;
    private int printCount = 0;
    private volatile static int addNumber = 1;

    public MyThread(Object lock, int showNumPosition, String showChar) {
        this.lock = lock;
        this.showNumPosition = showNumPosition;
        this.showChar = showChar;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true) {
                    if (addNumber % 3 == showNumPosition) {
                        System.out.println("ThreadName = " + Thread.currentThread().getName() + " runCount = " + addNumber + " " + showChar);
                        lock.notifyAll();
                        printCount++;
                        addNumber++;
                        if (printCount == 3) {
                            break;
                        }
                    } else {
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
