package com.threadSafe.reentrantLock.model;

import com.threadSafe.reentrantLock.service.ExceptionService;

public class MyThreadA extends Thread {
    private ExceptionService service;

    public MyThreadA(ExceptionService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
