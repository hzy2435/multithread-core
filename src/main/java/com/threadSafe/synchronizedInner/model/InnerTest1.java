package com.threadSafe.synchronizedInner.model;

public class InnerTest1 {
    public static void main(String[] args) {
        final OutClass.Inner inner = new OutClass.Inner();
        Thread t1 = new Thread(inner::method1, "A");
        Thread t2 = new Thread(inner::method2, "B");
        t1.start();
        t2.start();
    }
}
