package com.threadCommunication.producerConsumerStack.model;

import java.util.ArrayList;
import java.util.List;

public class MyStack2 {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            while (list.size() == 1) {  // solve the outOfArrayIndex Exception.
                this.wait();
            }
            list.add("string_" + Math.random());
            this.notifyAll();   // solve the deal lock, fake dead
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String valueString = "";
        try {
            while (list.size() == 0) {
                System.out.println("The thread " + Thread.currentThread().getName() + " in pop is waiting.");
                this.wait();
            }
            valueString = list.get(0);
            list.remove(0);
            this.notifyAll();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valueString;
    }
}
