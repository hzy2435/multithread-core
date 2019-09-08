package com.lock.awaitUninterruptiblyTest.test;

import com.lock.awaitUninterruptiblyTest.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        Thread a = new Thread(myService::testMethod);
        a.start();
        Thread.sleep(3000);
        a.interrupt();
    }
}
