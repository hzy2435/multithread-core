package com.timer.timerTest.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {
    private static Timer timer = new Timer();
    static class MyTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("I'm running. The time is " + new Date());
        }
    }

    public static void main(String[] args) {
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-08-30 23:16:50";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间： " + dateString + " 当前时间：" + new Date());
            timer.schedule(myTask, dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
