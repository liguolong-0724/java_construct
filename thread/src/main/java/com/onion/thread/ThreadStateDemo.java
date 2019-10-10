package com.onion.thread;

import java.util.concurrent.TimeUnit;

public class ThreadStateDemo {



    public static void main(String[] args) {
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"SLEEP_THREAD"
        ).start();

        new Thread(() -> {
            blocked();
        },"SYNC_THREAD_01").start();

        new Thread(() -> {
            blocked();
        },"SYNC_THREAD_02").start();
    }

    public static synchronized void blocked(){
        try {
            TimeUnit.SECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}


