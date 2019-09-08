package com.lock.awaitUnitTest.service;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("wait begin time = " + System.currentTimeMillis());
            condition.awaitUntil(calendar.getTime());
            System.out.println("wait end time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void notifyMethod() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.SECOND, 10);
            lock.lock();
            System.out.println("notify begin = " + System.currentTimeMillis());
            condition.notifyAll();
            System.out.println("notify end = " + System.currentTimeMillis());
        } finally {
            lock.unlock();
        }
    }
}
