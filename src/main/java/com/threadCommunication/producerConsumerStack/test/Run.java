package com.threadCommunication.producerConsumerStack.test;

import com.threadCommunication.producerConsumerStack.model.MyStack;

public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Thread producer = new Thread(() -> {
            while (true) myStack.push();
        });
        Thread consumer = new Thread(() -> {
            while (true) myStack.pop();
        });
        producer.start();
        consumer.start();
    }
}
