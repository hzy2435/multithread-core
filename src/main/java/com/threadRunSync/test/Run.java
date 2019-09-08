package com.threadRunSync.test;

import com.threadRunSync.thread.MyThread;

public class Run {
    public static void main(String[] args) {
        Object lock = new Object();
        new MyThread(lock, 1, "A").start();
        new MyThread(lock, 2, "B").start();
        new MyThread(lock, 0, "C").start();
    }
}
