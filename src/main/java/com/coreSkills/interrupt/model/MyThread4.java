package com.coreSkills.interrupt.model;

public class MyThread4 extends Thread {
    @Override
    public void run() {
        while (true) {
            if(this.isInterrupted()) {
                System.out.println("线程: " + this.getName() + " 停止");
                return;
            }
            System.out.println("线程 " + this.getName() + " : " + System.currentTimeMillis());
        }
    }
}
