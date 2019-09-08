package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunDelay {
    private static Timer timer = new Timer();
    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("task is running, the time is " + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        MyTask myTask = new MyTask();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2019-09-03 23:24:00";
        System.out.println("The timeString is " + dateString + ", now is " + new Date());
        timer.schedule(myTask, 7000);
    }
}
