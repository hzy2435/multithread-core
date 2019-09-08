package com.simpleDateFormatThread.fromatOk1.thread;

import com.simpleDateFormatThread.fromatOk1.tools.DateTools;

import java.text.ParseException;
import java.util.Date;

public class MyThread extends Thread {
    private String dateString;

    public MyThread(String dateString) {
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = DateTools.parse("yyyy-MM-dd", dateString);
            String newDateString = DateTools.format("yyyy-MM-dd", dateRef);
            if (!newDateString.equals(dateString)) {
                System.out.println("occured errors. threadName = " + Thread.currentThread().getName() +
                        ", dateString = " + dateString + ", newDateString = " + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
