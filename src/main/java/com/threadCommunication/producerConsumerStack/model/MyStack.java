package com.threadCommunication.producerConsumerStack.model;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list = new ArrayList<>();

    synchronized public void push() {
        try {
            if (list.size() == 1) {
                this.wait();
            }
            list.add("string_" + Math.random());
            this.notify();
            System.out.println("push = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String valueString = "";
        try {
            if (list.size() == 0) {
                System.out.println("The thread " + Thread.currentThread().getName() + " in pop is waiting.");
                this.wait();
            }
            valueString = list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop = " + list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valueString;
    }
}
