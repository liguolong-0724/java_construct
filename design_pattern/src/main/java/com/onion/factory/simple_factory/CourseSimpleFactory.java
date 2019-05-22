package com.onion.factory.simple_factory;

/**
 * 简单工厂方法：
 * 优点：
 * 工厂类是整个模式的关键.包含了必要的逻辑判断,根据外界给定的信息,决定究竟应该创建哪个具体类的对象.
 * 通过使用工厂类,外界可以从直接创建具体产品对象的尴尬局面摆脱出来,仅仅需要负责“消费”对象就可以了。
 *
 * 缺点：
 * 由于工厂类集中了所有实例的创建逻辑，违反了高内聚责任分配原则，将全部创建逻辑集中到了一个工厂类中；
 * 它所能创建的类只能是事先考虑到的，如果需要添加新的类，则就需要改变工厂类了。
 */
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
