package com.simpleDateFormatThread.formatError.test;

import com.simpleDateFormatThread.formatError.thread.MyThread;

import java.text.SimpleDateFormat;

public class Run {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String[] dateStringArray = new String[] {"2019-01-01", "2019-02-01", "2019-03-01", "2019-04-01", "2019-05-01", "2019-06-01", "2019-07-01", "2019-08-01", "2019-09-01", "2019-10-01"};
        for (int i = 0; i < 10; i++) {
            new MyThread(sdf, dateStringArray[i]).start();
        }
    }
}
