package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunPeriodTimerTask {
    private static Timer timer = new Timer();
    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("It's running. The time is " + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String timeString = "2019-09-01 23:51:30";
            Date dateRef = sdf.parse(timeString);
            System.out.println("The task timeString is " + timeString + ", now is " + new Date());
            timer.schedule(myTask, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
