package com.threadCommunication.waitNotify.test;

import com.threadCommunication.waitNotify.thread.ThreadA;
import com.threadCommunication.waitNotify.thread.ThreadB;

public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            Thread a = new ThreadA(lock);
            a.start();
            Thread.sleep(50);
            Thread b = new ThreadB(lock);
            b.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
