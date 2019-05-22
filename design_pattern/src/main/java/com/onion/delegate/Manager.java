package com.onion.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 经理类
 */
public class Manager {

    private Map<String,Staff> target = new HashMap<>();

    public Manager(){
        target.put("加密",new StaffA());
        target.put("架构",new StaffB());
    }


    public void doing(String command){
        target.get(command).doing(command);
    }
}
