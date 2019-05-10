package com.onion.abstract_factory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICode code = factory.createCode();
        INote note = factory.createNote();
        IVideo video = factory.createVideo();
        System.out.println(code.getName());
        System.out.println(note.getName());
        System.out.println(video.getName());
    }
}
