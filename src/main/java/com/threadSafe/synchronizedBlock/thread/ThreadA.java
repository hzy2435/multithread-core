package com.threadSafe.synchronizedBlock.thread;

import com.threadSafe.synchronizedBlock.service.ObjectService;

public class ThreadA extends Thread {
    private ObjectService service;

    public ThreadA(ObjectService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.serviceMethodA();
    }
}
