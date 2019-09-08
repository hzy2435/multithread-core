package com.threadSafe.synchronizedBlock.thread;

import com.threadSafe.synchronizedBlock.service.UserService;

public class ThreadC extends Thread {
    private UserService userService;

    public ThreadC(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run() {
        userService.setUsernamePassword("aa", "aa");
    }
}
