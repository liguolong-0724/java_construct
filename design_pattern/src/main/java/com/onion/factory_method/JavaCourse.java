package com.onion.factory_method;

/**
 * 定义Java课程，实现课程接口
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("Java recording...");
    }
}
