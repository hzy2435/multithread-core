package com.threadGroupException.test;

import com.threadGroupException.thread.MyThread;
import com.threadGroupException.thread.MyThreadGroup;

public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new MyThreadGroup("My thread group");
        for (int i = 0; i < 10; i++) {
            new MyThread(group, "thread" + (i + 1), "1").start();
        }

        new MyThread(group, "errorThread", "A").start();
    }
}
