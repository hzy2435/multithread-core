package com.lock.useMoreCondition.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA() {
        try {
            lock.lock();
            System.out.println("begin awaitA time is " + System.currentTimeMillis());
            conditionA.await();
            System.out.println("end awaitA time is " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB() {
        try {
            lock.lock();
            System.out.println("begin awaitB time is " + System.currentTimeMillis());
            conditionB.await();
            System.out.println("end awaitB time is " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        try {
            lock.lock();
            System.out.println("end signalAll_A time is " + System.currentTimeMillis() + " ThreadName is " + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_B() {
        try {
            lock.lock();
            System.out.println("end signalAll_B time is " + System.currentTimeMillis() + " ThreadName is " + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
