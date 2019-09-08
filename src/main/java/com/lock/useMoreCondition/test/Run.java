package com.lock.useMoreCondition.test;

import com.lock.useMoreCondition.service.MyService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        test1();
    }

    public static void test1() throws InterruptedException {
        MyService myService = new MyService();
        new Thread(myService::awaitA).start();
        new Thread(myService::awaitB).start();
        Thread.sleep(3000);
        myService.signalAll_A();
    }
}
