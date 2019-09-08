package com.singleton.test;

import com.singleton.model.DCLMyObject;
import com.singleton.model.MyObject;

public class Run {
    private static void test1() {
        Thread thread = new Thread(() -> System.out.println(MyObject.getInstance().hashCode()));
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }

    private static void test2() {
        Thread thread = new Thread(() -> System.out.println(DCLMyObject.getInstance().hashCode()));
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }

    public static void main(String[] args) {
        test2();
    }
}
