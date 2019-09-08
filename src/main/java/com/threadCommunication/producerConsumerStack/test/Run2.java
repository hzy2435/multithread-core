package com.threadCommunication.producerConsumerStack.test;

import com.threadCommunication.producerConsumerStack.model.MyStack2;

public class Run2 {
    public static void main(String[] args) {
        MyStack2 myStack = new MyStack2();
        Thread producer = new Thread(() -> {
            while (true) myStack.push();
        });
        Thread consumer1 = new Thread(() -> {
            while (true) myStack.pop();
        });
        Thread consumer2 = new Thread(() -> {
            while (true) myStack.pop();
        });
        Thread consumer3 = new Thread(() -> {
            while (true) myStack.pop();
        });
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
