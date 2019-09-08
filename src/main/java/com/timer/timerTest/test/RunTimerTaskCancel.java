package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunTimerTaskCancel {
    private static Timer timer = new Timer();
    static class TaskA extends TimerTask {
        @Override
        public void run() {
            try {
                System.out.println("TaskA begin at " + new Date());
                Thread.sleep(5000);
                System.out.println("TaskA end at " + new Date());
                this.cancel();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class TaskB extends TimerTask {
        @Override
        public void run() {
            System.out.println("TaskB is running! The time is " + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            TaskA taskA = new TaskA();
            TaskB taskB = new TaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-09-02 00:14:50";
            Date dateRef = sdf.parse(dateString);
            System.out.println("The timeString is " + dateString + ", now is " + new Date());
            timer.schedule(taskA, dateRef, 4000);
            timer.schedule(taskB, dateRef, 4000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
