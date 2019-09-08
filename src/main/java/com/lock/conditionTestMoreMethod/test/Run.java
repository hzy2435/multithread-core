package com.lock.conditionTestMoreMethod.test;

import com.lock.conditionTestMoreMethod.service.MyService;

public class Run {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        MyService myService = new MyService();
        Thread a = new Thread(myService::methodA);
        Thread aa = new Thread(myService::methodA);
        Thread b = new Thread(myService::methodA);
        Thread bb = new Thread(myService::methodA);
        a.setName("A");
        aa.setName("AA");
        b.setName("B");
        bb.setName("BB");
        a.start();
        aa.start();
        b.start();
        bb.start();
    }
}
