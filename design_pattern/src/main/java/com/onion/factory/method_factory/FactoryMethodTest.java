package com.onion.factory.method_factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourse course = new JavaCourseFactory().create();
        course.record();
    }
}
