package com.threadCommunication.waitNotify.model;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    private static List list = new ArrayList();

    public static void add() {
        list.add("any object");
    }

    public static int size() {
        return list.size();
    }
}
