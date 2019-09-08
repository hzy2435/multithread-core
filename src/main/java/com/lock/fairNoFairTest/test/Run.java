package com.lock.fairNoFairTest.test;

import com.lock.fairNoFairTest.service.MyService;

public class Run {
    public static void main(String[] args) {
//        runFair();
        runNoFair();
    }

    public static void runFair() {
        MyService myService = new MyService(true);
        for (int i = 0; i < 10; i++) {
            new Thread(myService::serviceMethod).start();
        }
    }

    public static void runNoFair() {
        MyService myService = new MyService(false);
        for (int i = 0; i < 10; i++) {
            new Thread(myService::serviceMethod).start();
        }
    }
}
