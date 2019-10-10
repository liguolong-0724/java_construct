package com.onion.thread;

import java.util.concurrent.TimeUnit;

public class StateResetDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("Done");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Thread_01");

        t.start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();
    }
}
