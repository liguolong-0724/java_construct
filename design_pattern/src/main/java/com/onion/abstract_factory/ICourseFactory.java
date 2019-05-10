package com.onion.abstract_factory;

/**
 * 核心抽象工厂类
 */
public interface ICourseFactory {
    // 创建视频
    IVideo createVideo();

    // 创建笔记
    INote createNote();

    // 创建源码
    ICode createCode();
}
