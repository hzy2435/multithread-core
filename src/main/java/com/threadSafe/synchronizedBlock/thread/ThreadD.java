package com.threadSafe.synchronizedBlock.thread;

import com.threadSafe.synchronizedBlock.service.UserService;

public class ThreadD extends Thread {
    private UserService userService;

    public ThreadD(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run() {
        userService.setUsernamePassword("bb", "bb");
    }
}
