package com.threadSafe.synNotExtends.model;

public class Sub extends Main {
    @Override
    public synchronized void serviceMethod() {
        try {
            System.out.println("sub begin sleep threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("sub end sleep threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
