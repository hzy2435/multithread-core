package com.singleton.model;

// DCL 双重检查锁机制
public class DCLMyObject {
    private static DCLMyObject myObject;
    private DCLMyObject() {
    }

    public static DCLMyObject getInstance() {
        if (myObject == null) {
            try {
                Thread.sleep(2000);
                synchronized (DCLMyObject.class) {
                    if (myObject == null) myObject = new DCLMyObject();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return myObject;
    }
}
