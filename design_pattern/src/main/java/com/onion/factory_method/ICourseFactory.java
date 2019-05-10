package com.onion.factory_method;

/**
 * 定义工作接口，返回类型为抽像课程
 */
public interface ICourseFactory {
    ICourse create();
}
