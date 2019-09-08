package com.threadCommunication.waitNotify.thread;

import com.threadCommunication.waitNotify.model.MyList;

public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                for (int i = 0; i < 10; i++) {
                    MyList.add();
                    if (MyList.size() == 5) {
                        System.out.println("ThreadB send notify");
                        lock.notify();
                    }
                    System.out.println("ThreadB add " + (i+1) + " element");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
