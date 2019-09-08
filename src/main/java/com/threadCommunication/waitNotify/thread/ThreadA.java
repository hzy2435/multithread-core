package com.threadCommunication.waitNotify.thread;

import com.threadCommunication.waitNotify.model.MyList;

public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            if (MyList.size() != 5) {
                try {
                    System.out.println("ThreadA begin wait " + System.currentTimeMillis());
                    lock.wait();
                    System.out.println("ThreadA end wait " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
