package com.onion.singleton;

public class Executor implements Runnable{

    private DoubleCheckSingleTon singleTon;

    @Override
    public void run() {
        singleTon = DoubleCheckSingleTon.getInstance();
        System.out.println(singleTon);
    }
}
