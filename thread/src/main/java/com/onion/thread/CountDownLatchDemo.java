package com.onion.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        Executor executor = Executors.newFixedThreadPool(2);
        CountDownLatch count = new CountDownLatch(2);

        executor.execute(() -> {
            System.out.println("Done...");
            count.countDown();
        });

        executor.execute(() -> {
            System.out.println("Done...");
            count.countDown();
        });

        count.await();

        System.out.println("main done");
    }
}
