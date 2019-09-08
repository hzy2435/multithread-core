package com.threadCommunication.threadLocal.model;

public class ThreadLocalExt extends ThreadLocal {
    @Override
    protected Object initialValue() {
        return "initial value, not return null.";
    }
}
