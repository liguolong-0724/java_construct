package com.onion.delegate;

public class StaffA implements Staff{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始做" + command + "工作");
    }
}
