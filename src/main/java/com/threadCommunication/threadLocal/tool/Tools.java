package com.threadCommunication.threadLocal.tool;

import com.threadCommunication.threadLocal.model.InheritableThreadLocalExt;

import java.util.Date;

public class Tools {
    public static ThreadLocal<String> t1 = new ThreadLocal<>();
    public static ThreadLocal<Date> t2 = new ThreadLocal<>();
    public static InheritableThreadLocalExt t3 = new InheritableThreadLocalExt();
}
