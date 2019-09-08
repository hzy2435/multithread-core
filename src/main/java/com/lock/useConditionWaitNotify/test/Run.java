package com.lock.useConditionWaitNotify.test;

import com.lock.useConditionWaitNotify.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    public static void test1() throws InterruptedException {
        MyService myService = new MyService();
        new Thread(myService::waitMethod).start();
        Thread.sleep(2000);
        myService.signaleMethod();
    }
}
