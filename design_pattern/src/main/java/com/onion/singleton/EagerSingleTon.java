package com.onion.singleton;

/**
 * 此种方式有线程安全问题
 */
public class EagerSingleTon {

    private static EagerSingleTon singleTon = null;

    private EagerSingleTon(){};

    public static EagerSingleTon getInstance(){
        if(singleTon == null){
            singleTon = new EagerSingleTon();
        }

        return singleTon;
    }
}
