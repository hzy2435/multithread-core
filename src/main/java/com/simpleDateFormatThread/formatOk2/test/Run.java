package com.simpleDateFormatThread.formatOk2.test;

import com.simpleDateFormatThread.formatOk2.thread.MyThread;

public class Run {
    public static void main(String[] args) {
        String[] dateStringArray = new String[] {"2019-01-01", "2019-02-01", "2019-03-01", "2019-04-01", "2019-05-01", "2019-06-01", "2019-07-01", "2019-08-01", "2019-09-01", "2019-10-01"};
        for (int i = 0; i < 10; i++) {
            new MyThread(dateStringArray[i]).start();
        }
    }
}
