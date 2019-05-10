package com.onion.singleton;

import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    public void hungrySingleTonTest(){
        HungrySingleTon s1 = HungrySingleTon.getInstance();
        HungrySingleTon s2 = HungrySingleTon.getInstance();
        System.out.println(s1 == s2);
    }

    @Test
    public void doubleCheckSingleTonTest(){
        new Thread(new Executor()).start();
        new Thread(new Executor()).start();

        System.out.println("debug end!");
    }

    @Test
    public void enumSingleTonTest(){
        EnumSingleTon d1 = EnumSingleTon.DataSource;
        EnumSingleTon d2 = EnumSingleTon.DataSource;
        System.out.println(d1 == d2);
    }
}
