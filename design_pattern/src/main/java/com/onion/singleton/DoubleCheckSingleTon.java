package com.onion.singleton;

/**
 * 双重检查锁避免线程安全问题
 */
public class DoubleCheckSingleTon {

    // 使用volatile修饰后解决指令重排序可能导致的问题
    private volatile static DoubleCheckSingleTon singleTon;

    private DoubleCheckSingleTon(){};

    public static DoubleCheckSingleTon getInstance(){
        if(singleTon == null){
            synchronized (DoubleCheckSingleTon.class){
                if(singleTon == null){
                    singleTon = new DoubleCheckSingleTon();
                }
            }
        }
        return singleTon;
    }
}
