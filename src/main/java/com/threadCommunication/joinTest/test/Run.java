package com.threadCommunication.joinTest.test;

import com.threadCommunication.joinTest.thread.MyThread;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread();
        thread.start();
        thread.join();
        System.out.println("Waiting test-thread running finish.");
    }
}
