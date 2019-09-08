package com.threadSafe.synchronizedMethod.test;

import com.threadSafe.synchronizedMethod.model.MyObject;
import com.threadSafe.synchronizedMethod.model.ThreadA;
import com.threadSafe.synchronizedMethod.model.ThreadB;

public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Thread a = new ThreadA(myObject);
        a.setName("A");
        Thread b = new ThreadB(myObject);
        b.setName("B");
        a.start();
        b.start();
    }
}
