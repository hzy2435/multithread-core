package com.threadSafe.synchronizedInner.model;

public class InnerTest2 {
    public static void main(String[] args) {
        OutClass2.InnerClass1 innerClass1 = new OutClass2.InnerClass1();
        OutClass2.InnerClass2 innerClass2 = new OutClass2.InnerClass2();

        Thread t1 = new Thread(() -> innerClass1.method1(innerClass2), "T1");
        Thread t2 = new Thread(innerClass1::method2, "T2");
        Thread t3 = new Thread(innerClass2::method1, "T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
