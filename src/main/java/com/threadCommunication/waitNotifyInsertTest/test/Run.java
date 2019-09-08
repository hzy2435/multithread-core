package com.threadCommunication.waitNotifyInsertTest.test;

import com.threadCommunication.waitNotifyInsertTest.model.DBTools;

public class Run {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 20; i++) {
            Thread backUpA = new Thread(dbTools::backupA);
            backUpA.start();
            Thread backUpB = new Thread(dbTools::backB);
            backUpB.start();
        }
    }
}
