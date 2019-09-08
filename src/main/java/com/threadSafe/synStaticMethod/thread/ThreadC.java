package com.threadSafe.synStaticMethod.thread;

import com.threadSafe.synStaticMethod.service.Service;

public class ThreadC extends Thread {
    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
