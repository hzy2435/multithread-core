package com.threadSafe.synNotExtends.model;

public class Main {
    synchronized public void serviceMethod() {
        try {
            System.out.println("int main begin sleep threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("int main end sleep threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
