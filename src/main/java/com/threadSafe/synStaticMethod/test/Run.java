package com.threadSafe.synStaticMethod.test;

import com.threadSafe.synStaticMethod.service.Service;
import com.threadSafe.synStaticMethod.thread.ThreadA;

public class Run {
    public static void main(String[] args) {
//        synStaticMethod();
        synTwoLock();
    }

    public static void synStaticMethod() {
        Thread a = new Thread(new Runnable() {
            public void run() {
                Service.printA();
            }
        });
        a.setName("A");
        a.start();
        Thread b = new Thread(new Runnable() {
            public void run() {
                Service.printB();
            }
        });
        b.setName("B");
        b.start();
    }

    public static void synTwoLock() {
        Service service = new Service();
        Thread a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread b = new ThreadA(service);
        b.setName("B");
        b.start();

        Thread c = new ThreadA(service);
        c.setName("C");
        c.start();

    }
}
