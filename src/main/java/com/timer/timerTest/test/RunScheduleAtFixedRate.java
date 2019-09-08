package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class RunScheduleAtFixedRate {
    private static Timer timer = new Timer();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static class TaskA extends TimerTask {
        private int i = 0;
        @Override
        public void run() {
            try {
                System.out.println("taskA begin at " + new Date());
                Thread.sleep(2000);
                System.out.println("taskA end at " + new Date());
                if (++i == 5) {
                    this.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static class TaskB extends TimerTask {
        private int i = 0;
        @Override
        public void run() {
            try {
                System.out.println("taskB begin at " + new Date());
                Thread.sleep(5000);
                System.out.println("taskB end at " + new Date());
                if (++i == 5) {
                    this.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void testA() throws ParseException {
        TaskA taskA = new TaskA();
        String dateString = "2019-09-07 12:34:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println("The dateString is " + dateString + ", now is " + new Date());
        timer.scheduleAtFixedRate(taskA, dateRef, 3000);
    }

    private static void testB() throws ParseException {
        TaskB taskB = new TaskB();
        String dateString = "2019-09-07 12:35:00";
        Date dateRef = sdf.parse(dateString);
        System.out.println("The dateString is " + dateString + ", now is " + new Date());
        timer.scheduleAtFixedRate(taskB, dateRef, 3000);
    }

    public static void main(String[] args) throws ParseException {
        testB();
    }
}
