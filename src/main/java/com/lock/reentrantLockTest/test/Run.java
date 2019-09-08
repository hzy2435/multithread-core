package com.lock.reentrantLockTest.test;

import com.lock.reentrantLockTest.service.MyService;

public class Run {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MyService myService = new MyService();
        new Thread(myService::testMethod).start();
        new Thread(myService::testMethod).start();
        new Thread(myService::testMethod).start();
        new Thread(myService::testMethod).start();
    }
}
