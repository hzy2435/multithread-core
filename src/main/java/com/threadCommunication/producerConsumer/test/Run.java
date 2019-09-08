package com.threadCommunication.producerConsumer.test;

import com.threadCommunication.producerConsumer.entity.Consumer;
import com.threadCommunication.producerConsumer.entity.Producer;
import com.threadCommunication.producerConsumer.thread.ConsumerThread;
import com.threadCommunication.producerConsumer.thread.ProducerThread;

public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Thread p = new ProducerThread(producer);
        p.setName("Producer");
        p.start();
        Consumer consumer = new Consumer(lock);
        Thread c = new ConsumerThread(consumer);
        c.setName("Consumer");
        c.start();
    }
}
