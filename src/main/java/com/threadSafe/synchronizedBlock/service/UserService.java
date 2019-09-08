package com.threadSafe.synchronizedBlock.service;

public class UserService {
    private String usernameParam;
    private String passwordParam;
    private String anyString = "";

    public void setUsernamePassword(String usernameParam, String passwordParam) {
        try {
            synchronized (anyString) {
                System.out.println("Thread name is: " + Thread.currentThread().getName()
                    + " at " + System.currentTimeMillis() + " entry Synchronized block.");
                this.usernameParam = usernameParam;
                Thread.sleep(3000);
                this.passwordParam = passwordParam;
                System.out.println("Thread name is: " + Thread.currentThread().getName()
                        + " at " + System.currentTimeMillis() + " leave Synchronized block.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
