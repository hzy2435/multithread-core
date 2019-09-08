package com.simpleDateFormatThread.formatError.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    private SimpleDateFormat sdf;
    private String dateString;

    public MyThread(SimpleDateFormat sdf, String dateString) {
        this.sdf = sdf;
        this.dateString = dateString;
    }

    @Override
    public void run() {
        try {
            Date dateRef = sdf.parse(dateString);
            String newDateString = sdf.format(dateRef);
            if (!dateString.equals(newDateString)) {
                System.out.println("occured errors. threadName = " + Thread.currentThread().getName() +
                        ", dateString = " + dateString + ", newDateString = " + newDateString);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
