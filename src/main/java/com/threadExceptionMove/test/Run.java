package com.threadExceptionMove.test;

import com.threadExceptionMove.thread.MyThread;
import com.threadExceptionMove.thread.MyThreadGroup;

public class Run {
    public static void main(String[] args) {
        ThreadGroup group = new MyThreadGroup("myGroup");
        MyThread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("MyThread class occur error");
            e.printStackTrace();
        });
        Thread threada = new MyThread(group, "threadA");
//        threada.setUncaughtExceptionHandler((t, e) -> {
//            System.out.println("MyThread object threada occur error");
//            e.printStackTrace();
//        });
        threada.start();
    }
}
