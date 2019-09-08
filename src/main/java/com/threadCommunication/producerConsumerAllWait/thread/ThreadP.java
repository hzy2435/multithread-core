package com.threadCommunication.producerConsumerAllWait.thread;

import com.threadCommunication.producerConsumerAllWait.entity.Producer;

public class ThreadP extends Thread {
    private Producer producer;

    public ThreadP(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
