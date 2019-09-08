package com.threadCreateException.thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        String userName = null;
        System.out.println(userName.hashCode());
    }
}
