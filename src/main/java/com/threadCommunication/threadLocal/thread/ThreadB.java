package com.threadCommunication.threadLocal.thread;

import com.threadCommunication.threadLocal.tool.Tools;

public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadB" + i);
                System.out.println("ThreadB getValue: " + Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
