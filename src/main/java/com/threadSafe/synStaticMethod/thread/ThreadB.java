package com.threadSafe.synStaticMethod.thread;

import com.threadSafe.synStaticMethod.service.Service;

public class ThreadB extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printB();
    }
}
