package com.threadSafe.synNotExtends.model;

public class MyThreadB extends Thread {
    private Sub sub;

    public MyThreadB(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
