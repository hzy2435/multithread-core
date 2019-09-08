package com.lock.useConditionWaitNotify.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("wait time = " + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signaleMethod() {
        lock.lock();
        System.out.println("signal time = " + System.currentTimeMillis());
        condition.signal();
        lock.unlock();
    }
}
