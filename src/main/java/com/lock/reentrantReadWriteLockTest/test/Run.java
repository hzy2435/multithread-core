package com.lock.reentrantReadWriteLockTest.test;

import com.lock.reentrantReadWriteLockTest.service.MyService;

public class Run {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    private static void test1() {
        MyService myService = new MyService();
        new Thread(myService::read).start();
        new Thread(myService::read).start();
    }

    public static void test2() {
        MyService myService = new MyService();
        new Thread(myService::write).start();
        new Thread(myService::write).start();
    }

    public static void test3() {
        MyService myService = new MyService();
        new Thread(myService::write).start();
        new Thread(myService::read).start();
    }

    public static void test4() {
        MyService myService = new MyService();
        new Thread(myService::read).start();
        new Thread(myService::write).start();
    }
}
