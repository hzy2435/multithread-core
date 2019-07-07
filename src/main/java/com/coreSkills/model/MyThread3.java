package com.coreSkills.model;

public class MyThread3 extends Thread {
    @Override
    public void run() {
//        try {
//            System.out.println("run begin");
//            Thread.sleep(200000);
//            System.out.println("run end");
//        } catch (InterruptedException e) {
//            System.out.println("在沉睡中被停止！进入 catch！" + this.isInterrupted());
//            e.printStackTrace();
//        }
        
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i = " + (i + 1));
            }

            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到 sleep！进入 catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
