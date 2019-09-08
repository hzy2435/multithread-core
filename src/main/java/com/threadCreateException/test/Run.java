package com.threadCreateException.test;

import com.threadCreateException.thread.MyThread;

public class Run {
    private static void test1() {
        Thread t1 = new MyThread();
        t1.setName("A");
        t1.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("Thread name is " + t.getName() + " occur error.");
            e.printStackTrace();
        });
        t1.start();

        Thread t2 = new MyThread();
        t2.setName("B");
        t2.start();
    }

    private static void test2() {
        MyThread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("Thread name is " + t.getName() + " occur error.");
            e.printStackTrace();
        });
        Thread a = new MyThread();
        a.setName("A");
        a.start();

        Thread b = new MyThread();
        b.setName("B");
        b.start();
    }

    public static void main(String[] args) {
//        test1();
        test2();
    }
}
