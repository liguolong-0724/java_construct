package com.onion.factory.simple_factory;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        ICourse javaCourse = CourseSimpleFactory.create(JavaCourse.class);
        javaCourse.record();
    }
}
