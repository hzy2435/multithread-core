package com.threadSafe.synchronizedBlock.thread;

import com.threadSafe.synchronizedBlock.service.ObjectService;

public class ThreadB extends Thread {
    private ObjectService service;

    public ThreadB(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodB();
    }
}
