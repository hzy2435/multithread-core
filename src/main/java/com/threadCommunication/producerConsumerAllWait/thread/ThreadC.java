package com.threadCommunication.producerConsumerAllWait.thread;

import com.threadCommunication.producerConsumerAllWait.entity.Consumer;

public class ThreadC extends Thread {
    private Consumer consumer;

    public ThreadC(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
