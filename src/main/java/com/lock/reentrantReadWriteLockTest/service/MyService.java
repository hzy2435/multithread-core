package com.lock.reentrantReadWriteLockTest.service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyService {
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read() {
        try {
            lock.readLock().lock();
            System.out.println("get lock: " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }

    public void write() {
        try {
            lock.writeLock().lock();
            System.out.println("get lock: " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
