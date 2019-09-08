package com.groupThread.test;

public class Run {
    private static void test1() {
        Thread thread = new Thread(() -> {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("ThreadName = " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroupTest");
        Thread threadA = new Thread(threadGroup, thread);
        Thread threadB = new Thread(threadGroup, thread);

        threadA.start();
        threadB.start();
        System.out.println("The thread group name is " + threadGroup.getName());
        System.out.println("The active thread num is " + threadGroup.activeCount());
    }

    private static void test2() {
        Runnable runnable = () -> {
            try {
                System.out.println("runMethod!");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup group = new ThreadGroup(mainThreadGroup, "A");
        Thread thread = new Thread(group, runnable);
        thread.setName("Z");
        thread.start();

        ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup);
        System.out.println("mainThreadGroup has " + listGroup.length + " threadGroup, name is " + listGroup[0].getName());

        Thread[] listThread = new Thread[listGroup[0].activeCount()];
        listGroup[0].enumerate(listThread);
        System.out.println("AThreadGroup has " + listThread.length + " threads, name is " + listThread[0].getName());
    }

    private static void test3() {
        Runnable runnable = () -> {
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " is begin.");
            while (!Thread.currentThread().isInterrupted()) {
            }
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " is end.");
        };

        ThreadGroup group = new ThreadGroup("testGroup");
        for (int i = 0; i < 5; i++) {
            new Thread(group, runnable, "thread" + i).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        group.interrupt();
        System.out.println(" calling interrupt() method.");
    }

    private static void test4() {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup groupA = new ThreadGroup(mainGroup, "A");
        ThreadGroup groupB = new ThreadGroup(groupA, "B");

        ThreadGroup[] listGroup1 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup1, true);
        for (int i = 0; i < listGroup1.length; i++) {
            if (listGroup1[i] != null) System.out.println(listGroup1[i].getName());
        }

        ThreadGroup[] listGroup2 = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
        Thread.currentThread().getThreadGroup().enumerate(listGroup2, false);
        for (int i = 0; i < listGroup2.length; i++) {
            if (listGroup2[i] != null) System.out.println(listGroup2[i].getName());
        }
    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }
}
