package com.threadSafe.synchronizedLockChange.test;

import com.threadSafe.synchronizedLockChange.service.MyService;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        Thread t1 = new Thread(service::testMethod, "A");
        Thread t2 = new Thread(service::testMethod, "B");
        t1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
