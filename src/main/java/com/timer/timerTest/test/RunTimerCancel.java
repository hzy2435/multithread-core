package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimerCancel {
    private static Timer timer = new Timer();
    static class TaskA extends TimerTask {
        @Override
        public void run() {
            System.out.println("TaskA is running, time is " + new Date());
            timer.cancel();
        }
    }
    static class TaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("TaskB is running, time is " + new Date());
        }
    }

    public static void main(String[] args) throws ParseException {
        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = "2019-09-03 22:59:10";
        Date dateRef = sdf.parse(dateString);
        System.out.println("The timeString is " + dateString + ", now is " + new Date());
        timer.schedule(taskA, dateRef, 4000);
        timer.schedule(taskB, dateRef, 4000);
    }
}
