package com.threadSafe.instanceVariable.model;

public class MyThread2 extends Thread {
    private HasSelfPrivateNum numRef;

    public MyThread2(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        numRef.addI("b");
    }
}
