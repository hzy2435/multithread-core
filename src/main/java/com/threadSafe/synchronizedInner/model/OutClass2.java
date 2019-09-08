package com.threadSafe.synchronizedInner.model;

public class OutClass2 {
    static class InnerClass1 {
        public void method1(InnerClass2 innerClass2) {
            synchronized (innerClass2) {
                System.out.println(Thread.currentThread().getName() + " enter InnerClass1 of method1");
                for (int i = 0; i < 10; i++) {
                    System.out.println("i = " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " leave InnerClass1 of method1");
            }
        }

        synchronized void method2() {
            System.out.println(Thread.currentThread().getName() + " enter InnerClass1 of method2");
            for (int j = 0; j < 10; j++) {
                System.out.println("j = " + j);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " leave InnerClass1 of method2");
        }
    }

    static class InnerClass2 {
        public synchronized void method1() {
            System.out.println(Thread.currentThread().getName() + " enter InnerClass2 of method1");
            for (int k = 0; k < 10; k++) {
                System.out.println("k = " + k);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " leave InnerClass2 of method1");
        }
    }
}
