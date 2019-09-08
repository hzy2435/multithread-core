package com.simpleDateFormatThread.formatOk2.thread;

import com.simpleDateFormatThread.formatOk2.tools.DateTool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    private String dateString;

    public MyThread(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            SimpleDateFormat sdf  = DateTool.getSimpleDateFormat("yyyy-MM-dd");
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("occured errors. threadName = " + Thread.currentThread().getName() +
                        ", dateString = " + dateString + ", newDateString = " + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
