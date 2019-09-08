package com.coreSkills.priority.test;

import com.coreSkills.priority.model.MyThread1;
import com.coreSkills.priority.model.MyThread3;
import com.coreSkills.priority.model.MyThread4;

public class Run {
    public static void main(String[] args) {
//        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
//        System.out.println("main thread end priority = " + Thread.currentThread().getPriority());
//        MyThread1 myThread1 = new MyThread1();
//        myThread1.start();

        for (int i = 0; i < 5; i++) {
            MyThread3 myThread3 = new MyThread3();
            myThread3.setPriority(10);
            myThread3.start();
            MyThread4 myThread4 = new MyThread4();
            myThread4.setPriority(1);
            myThread4.start();
        }
    }
}
