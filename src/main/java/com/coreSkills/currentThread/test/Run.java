package com.coreSkills.currentThread.test;

import com.coreSkills.currentThread.model.CountOperate;

public class Run {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
