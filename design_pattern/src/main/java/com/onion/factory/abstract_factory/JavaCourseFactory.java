package com.onion.factory.abstract_factory;

public class JavaCourseFactory implements ICourseFactory {
    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public ICode createCode() {
        return new JavaCode();
    }
}
