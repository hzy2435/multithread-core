package com.threadSafe.synStaticMethod.service;

public class Service {
    synchronized public static void printA() {
        try {
            System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " entry printA method");
            Thread.sleep(3000);
            System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " leave printA method");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " entry printB method");
        System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " leave printB method");
    }

    synchronized public void printC() {
        System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " entry printC method");
        System.out.println("The thread " + Thread.currentThread().getName() + " at " + System.currentTimeMillis() + " leave printC method");
    }
}
