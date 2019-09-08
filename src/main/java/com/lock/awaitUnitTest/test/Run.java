package com.lock.awaitUnitTest.test;

import com.lock.awaitUnitTest.service.MyService;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        new Thread(myService::waitMethod).start();
    }
}
