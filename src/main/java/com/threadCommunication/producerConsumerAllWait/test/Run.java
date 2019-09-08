package com.threadCommunication.producerConsumerAllWait.test;

import com.threadCommunication.producerConsumerAllWait.entity.Consumer;
import com.threadCommunication.producerConsumerAllWait.entity.Producer;
import com.threadCommunication.producerConsumerAllWait.thread.ThreadC;
import com.threadCommunication.producerConsumerAllWait.thread.ThreadP;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        Thread[] producerThreads = new ThreadP[2];
        Thread[] consumerThreads = new ThreadC[2];
        for (int i = 0; i < 2; i++) {
            producerThreads[i] = new ThreadP(producer);
            producerThreads[i].setName("Producer " + (i + 1));
            consumerThreads[i] = new ThreadC(consumer);
            consumerThreads[i].setName("Consumer " + (i + 1));
            producerThreads[i].start();
            consumerThreads[i].start();
        }

        Thread.sleep(5000);
        Thread[] currentThreads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(currentThreads);
        for (int i = 0; i < currentThreads.length; i++) {
            System.out.println("Thread name : " + currentThreads[i].getName() + " , status: " + currentThreads[i].getState());
        }
    }
}
