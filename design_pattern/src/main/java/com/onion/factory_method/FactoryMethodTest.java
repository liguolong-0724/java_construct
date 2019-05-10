package com.onion.factory_method;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourse course = new JavaCourseFactory().create();
        course.record();
    }
}
