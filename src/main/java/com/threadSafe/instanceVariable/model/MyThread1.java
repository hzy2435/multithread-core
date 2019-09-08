package com.threadSafe.instanceVariable.model;

public class MyThread1 extends Thread {
    private HasSelfPrivateNum numRef;

    public MyThread1(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.addI("a");
    }
}
