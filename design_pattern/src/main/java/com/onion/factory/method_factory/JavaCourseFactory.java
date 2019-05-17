package com.onion.factory.method_factory;

/**
 * 定义具体工厂类，实现课程接口，具体工厂创建具体的课程对象
 */
public class JavaCourseFactory implements ICourseFactory {

    private JavaCourse javaCourse;
    @Override
    public JavaCourse create() {
        javaCourse = new JavaCourse();
        return javaCourse;
    }
}
