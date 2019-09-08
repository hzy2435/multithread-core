package com.coreSkills.interrupt.test;

import com.coreSkills.interrupt.model.MyThread;
import com.coreSkills.interrupt.model.MyThread2;
import com.coreSkills.interrupt.model.MyThread3;
import com.coreSkills.interrupt.model.MyThread4;

/**
 * 1. 调用 `interrupt()` 方法仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程;
 * 2. `this.interrupted()`: 测试当前线程是否已经中断,线程的中断状态由该方法清除
 * 3. `this.isInterruped()`: 测试线程 Thread 对象是否已经是中断状态，但不清除状态标志
 */
public class InterruptTest {
    /**
     * 调用 `interrupt()` 方法仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程
     */
    public static void test1() {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * this.interrupted()`: 测试当前线程是否已经中断,线程的中断状态由该方法清除
     */
    private static void test2() {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ = " + myThread.interrupted());
            System.out.println("是否停止2？ = " + myThread.interrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    private static void test3() {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1？ = " + Thread.interrupted());
        System.out.println("是否停止2？ = " + Thread.interrupted());
        System.out.println("end!");
    }

    /**
     * `this.isInterruped()`: 测试线程 Thread 对象是否已经是中断状态，但不清除状态标志
     */
    private static void test4() {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ = " + myThread.isInterrupted());
            System.out.println("是否停止2？ = " + myThread.isInterrupted());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    /**
     * 可在线程中用 for 语句来判断一下线程是否是停止状态，如果是停止状态，则后面的代码不再运行即可
     */
    private static void test5() {
        try {
            MyThread2 thread2 = new MyThread2();
            thread2.start();
            Thread.sleep(2000);
            thread2.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    /**
     * 在沉睡中停止
     */
    private static void test6() {
        try {
            MyThread3 thread3 = new MyThread3();
            thread3.start();
            Thread.sleep(200);
            thread3.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end!");
    }

    /**
     * 使用 return 停止线程
     */
    private static void test7() {
        try {
            MyThread4 thread4 = new MyThread4();
            thread4.start();
            Thread.sleep(2000);
            thread4.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // test2();
//        test3();
//        test4();
//        test5();
//        test6();
        test7();
    }
}
