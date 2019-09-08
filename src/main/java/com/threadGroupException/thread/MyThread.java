package com.threadGroupException.thread;

public class MyThread extends Thread {
    private String number;

    public MyThread(ThreadGroup group, String name, String number) {
        super(group, name);
        this.number = number;
    }

    @Override
    public void run() {
        int numInt = Integer.parseInt(number);
        while (!this.isInterrupted()) {
            System.out.println("do in while: " + Thread.currentThread().getName());
        }
    }
}
