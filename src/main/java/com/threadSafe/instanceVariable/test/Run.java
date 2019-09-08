package com.threadSafe.instanceVariable.test;

import com.threadSafe.instanceVariable.model.HasSelfPrivateNum;
import com.threadSafe.instanceVariable.model.MyThread1;
import com.threadSafe.instanceVariable.model.MyThread2;

public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        MyThread1 myThread1 = new MyThread1(hasSelfPrivateNum);
        myThread1.start();
        MyThread2 myThread2 = new MyThread2(hasSelfPrivateNum);
        myThread2.start();
    }
}
