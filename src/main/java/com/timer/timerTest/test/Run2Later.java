package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run2Later {
    private static Timer timer = new Timer();
    static class MyTask1 extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("1 begin running! The time is " + new Date());
                Thread.sleep(20000);
                System.out.println("1 end running! The time is " + new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class MyTask2 extends TimerTask {
        @Override
        public void run() {
            System.out.println("2 begin running! The time is " + new Date());
            System.out.println("2 end running! The time is " + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask1 myTask1 = new MyTask1();
            MyTask2 myTask2 = new MyTask2();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString1 = "2019-08-30 23:57:00";
            String dateString2 = "2019-08-30 23:57:10";
            Date date1 = sdf.parse(dateString1);
            Date date2 = sdf.parse(dateString2);
            System.out.println("The timeString is " + dateString1 + ", now is " + new Date());
            System.out.println("The timeString is " + dateString2 + ", now is " + new Date());
            timer.schedule(myTask1, date1);
            timer.schedule(myTask2, date2);
        } catch(ParseException e) {
            e.printStackTrace();
        }
    }
}
