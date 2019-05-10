package com.onion.singleton;

/**
 * 单例设计模式
 */
public class HungrySingleTon {

    private static final HungrySingleTon singleTon = new HungrySingleTon();

    // 构造方法私有化
    private HungrySingleTon(){};

    // 提供对外访问的函数
    public static HungrySingleTon getInstance(){
        return singleTon;
    }

}
