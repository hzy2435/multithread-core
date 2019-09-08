package com.threadSafe.automicIntegerTest.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountTread extends Thread {
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
