package com.threadSafe.synchronizedBlock.test;

import com.threadSafe.synchronizedBlock.model.MyThread1;
import com.threadSafe.synchronizedBlock.model.Task;
import com.threadSafe.synchronizedBlock.service.ObjectService;
import com.threadSafe.synchronizedBlock.service.UserService;
import com.threadSafe.synchronizedBlock.thread.ThreadA;
import com.threadSafe.synchronizedBlock.thread.ThreadB;
import com.threadSafe.synchronizedBlock.thread.ThreadC;
import com.threadSafe.synchronizedBlock.thread.ThreadD;

public class Run {
    public static void main(String[] args) {
//        Task task = new Task();
//        MyThread1 thread1 = new MyThread1(task);
//        thread1.start();
//        MyThread1 thread2 = new MyThread1(task);
//        thread2.start();

//        doubleSynBlockOneTwo();
        synBlockString();
    }

    public static void doubleSynBlockOneTwo() {
        ObjectService service = new ObjectService();
        Thread threadA = new ThreadA(service);
        threadA.setName("a");
        threadA.start();
        Thread threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }

    public static void synBlockString() {
        UserService userService = new UserService();
        Thread a = new ThreadC(userService);
        a.setName("a");
        a.start();
        Thread b = new ThreadD(userService);
        b.setName("b");
        b.start();
    }
}
