package com.threadCommunication.producerConsumer.thread;

import com.threadCommunication.producerConsumer.entity.Consumer;

public class ConsumerThread extends Thread {
    private Consumer consumer;

    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
