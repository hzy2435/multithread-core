package com.threadSafe.reentrantLock.model;

import com.threadSafe.reentrantLock.service.Service;

public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
