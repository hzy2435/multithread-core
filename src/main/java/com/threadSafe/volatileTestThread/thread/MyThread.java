package com.threadSafe.volatileTestThread.thread;

public class MyThread extends Thread {
    volatile private static int count;
//    private static void addCount() {
    synchronized private static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count = " + count);
    }

    @Override
    public void run() {
        addCount();
    }
}
