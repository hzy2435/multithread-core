package com.threadSafe.reentrantLock.model;

import com.threadSafe.reentrantLock.service.ExceptionService;

public class MyThreadB extends Thread {
    private ExceptionService service;

    public MyThreadB(ExceptionService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
