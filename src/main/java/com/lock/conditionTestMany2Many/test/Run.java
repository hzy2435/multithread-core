package com.lock.conditionTestMany2Many.test;

import com.lock.conditionTestMany2Many.service.MyService;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                while (true) myService.setValue();
            }).start();
            new Thread(() -> {
                while (true) myService.getValue();
            }).start();
        }
    }
}
