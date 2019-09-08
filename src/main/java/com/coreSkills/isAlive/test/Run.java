package com.coreSkills.isAlive.test;

import com.coreSkills.isAlive.model.CountOperate;

public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive = " + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 is Alive = " + t1.isAlive());
    }
}
