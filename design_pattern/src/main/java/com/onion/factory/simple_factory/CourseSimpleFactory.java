package com.onion.factory.simple_factory;

public class CourseSimpleFactory {
    // 简单工厂的核心方法
    public static ICourse create(Class clazz){
        ICourse course = null;
        try{
            course = (ICourse) Class.forName(clazz.getName()).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }

        return course;
    }
}
