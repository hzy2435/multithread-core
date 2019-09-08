package com.threadSafe.synStaticMethod.thread;

import com.threadSafe.synStaticMethod.service.Service;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printA();
    }
}
