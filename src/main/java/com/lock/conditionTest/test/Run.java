package com.lock.conditionTest.test;

import com.lock.conditionTest.service.MyService;

public class Run {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MyService myService = new MyService();
        new Thread(myService::waitMethod).start();
    }
}
