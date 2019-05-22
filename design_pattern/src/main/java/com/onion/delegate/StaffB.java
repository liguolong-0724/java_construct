package com.onion.delegate;

public class StaffB implements Staff {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我开始做" + command + "工作");
    }
}
