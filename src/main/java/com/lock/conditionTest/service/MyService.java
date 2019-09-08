package com.lock.conditionTest.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " -> a");
            condition.await();
            System.out.println(Thread.currentThread().getName() + " -> b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("lock is release.");
        }
    }
}
