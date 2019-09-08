package com.singleton.model;

public class MyObject {
    private static MyObject myObject = new MyObject();

    public MyObject() {
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
