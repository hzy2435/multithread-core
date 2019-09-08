package com.threadCommunication.joinTest.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            int sleepTime = (int) (Math.random() * 10000);
            System.out.println(sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
