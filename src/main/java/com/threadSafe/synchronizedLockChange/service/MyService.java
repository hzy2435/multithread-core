package com.threadSafe.synchronizedLockChange.service;

public class MyService {
    private String lock = "123";
    public void testMethod() {
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " begin at " + System.currentTimeMillis());
            lock = "456";
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end at " + System.currentTimeMillis());
        }
    }
}
