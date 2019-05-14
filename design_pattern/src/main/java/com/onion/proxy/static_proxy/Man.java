package com.onion.proxy.static_proxy;

import com.onion.proxy.Person;

public class Man implements Person {
    @Override
    public void findLove() {
        System.out.println("找个女的！");
    }
}
