package com.threadSafe.reentrantLock.test;

import com.threadSafe.reentrantLock.model.MyThread;
import com.threadSafe.reentrantLock.model.MyThread1;
import com.threadSafe.reentrantLock.model.MyThreadA;
import com.threadSafe.reentrantLock.model.MyThreadB;
import com.threadSafe.reentrantLock.service.ExceptionService;

public class Run {
    public static void main(String[] args) throws InterruptedException {
//        MyThread t = new MyThread();
//        MyThread1 t = new MyThread1();
//        t.start();

        ExceptionService service = new ExceptionService();
        Thread a = new MyThreadA(service);
        a.setName("a");
        a.start();
        Thread.sleep(500);
        Thread b = new MyThreadB(service);
        b.setName("b");
        b.start();
    }
}
