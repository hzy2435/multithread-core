package com.threadCommunication.threadLocal.test;

import com.threadCommunication.threadLocal.thread.ThreadA;
import com.threadCommunication.threadLocal.thread.ThreadB;
import com.threadCommunication.threadLocal.tool.Tools;

import java.io.IOException;
import java.util.Date;

public class Run {
    private static ThreadLocal<String> t1 = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
//        if (t1.get() == null) {
//            System.out.println("never put any value");
//            t1.set("my value");
//        }
//        System.out.println(t1.get());
//        System.out.println(t1.get());
//        test1();
//        test2();
        test3();
    }

    public static void test1() throws InterruptedException {
        Thread a = new ThreadA();
        Thread b = new ThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 100; i++) {
            Tools.t1.set("MainThread" + i);
            System.out.println("MainThread getValue: " + Tools.t1.get());
            Thread.sleep(200);
        }
    }

    public static void test2() throws InterruptedException {
        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    if (Tools.t2.get() == null) {
                        Tools.t2.set(new Date());
                    }
                    System.out.println("A " + Tools.t2.get().getTime());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            try {
                for (int i = 0; i < 20; i++) {
                    if (Tools.t2.get() == null) {
                        Tools.t2.set(new Date());
                    }
                    System.out.println("B " + Tools.t2.get().getTime());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
    
    public static void test3() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread -> " + Tools.t3.get());
            Thread.sleep(100);
        }
        Thread.sleep(5000);
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("ThreadA -> " + Tools.t3.get());
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
