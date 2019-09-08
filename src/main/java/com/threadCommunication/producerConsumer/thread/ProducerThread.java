package com.threadCommunication.producerConsumer.thread;

import com.threadCommunication.producerConsumer.entity.Producer;

public class ProducerThread extends Thread {
    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
