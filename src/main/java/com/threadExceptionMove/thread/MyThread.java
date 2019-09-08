package com.threadExceptionMove.thread;

public class MyThread extends Thread {
    private String num = "a";

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(num);
        System.out.println("Thread run num is " + (numInt + 1));
    }
}
