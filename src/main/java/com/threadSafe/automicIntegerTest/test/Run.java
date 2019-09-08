package com.threadSafe.automicIntegerTest.test;

import com.threadSafe.automicIntegerTest.thread.AddCountTread;

public class Run {
    public static void main(String[] args) {
        AddCountTread countService = new AddCountTread();
        Thread t1 = new Thread(countService);
        t1.start();
        Thread t2 = new Thread(countService);
        t2.start();
        Thread t3 = new Thread(countService);
        t3.start();
        Thread t4 = new Thread(countService);
        t4.start();
        Thread t5 = new Thread(countService);
        t5.start();
    }
}
