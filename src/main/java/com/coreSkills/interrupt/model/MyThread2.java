package com.coreSkills.interrupt.model;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 500000; i++) {
//            if(this.interrupted()) {
//                System.out.println("已经是停止状态了，我要退出了");
//                break;
//            }
//            if(Thread.interrupted()) {
//                System.out.println("已经是停止状态了，我要退出了");
//                break;
//            }
//            if(this.isInterrupted()) {
//                System.out.println("已经是停止状态了，我要退出了");
//                break;
//            }
                if (Thread.interrupted()) {
                    System.out.println("已经是停止状态了，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i + 1));
            }
            System.out.println("我在 for 下面");
        } catch (InterruptedException e) {
            System.out.println("进入 MyThread2.java 类 run 方法中的 catch 了");
            e.printStackTrace();
        }
    }
}
