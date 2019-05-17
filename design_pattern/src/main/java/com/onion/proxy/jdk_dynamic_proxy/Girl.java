package com.onion.proxy.jdk_dynamic_proxy;

import com.onion.proxy.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("我要找一个男的！");
    }
}
