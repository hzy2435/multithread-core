package com.lock.conditionTestMany2Many.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void setValue() {
        try {
            lock.lock();
            while (hasValue) {
                System.out.println("=== set value is waiting ===");
                condition.await();
            }
            System.out.println("** setValue **");
            hasValue = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void getValue() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println("+++ get value is waiting +++");
                condition.await();
            }
            System.out.println("## getValue ##");
            hasValue = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
