package com.threadSafe.synNotExtends.test;

import com.threadSafe.synNotExtends.model.MyThreadA;
import com.threadSafe.synNotExtends.model.MyThreadB;
import com.threadSafe.synNotExtends.model.Sub;

public class Run {
    public static void main(String[] args) {
        Sub sub = new Sub();
        Thread a = new MyThreadA(sub);
        a.setName("a");
        a.start();
        Thread b = new MyThreadB(sub);
        b.setName("b");
        b.start();
    }
}
