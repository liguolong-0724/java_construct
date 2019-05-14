package com.onion.proxy.static_proxy;

import com.onion.proxy.Person;

/**
 * 静态代理模式：
 * 代理类要和目标类实现相同的接口或基类
 *
 * 缺点：
 * 1) 1个代理类只能服务于一种类型的对象，因为代理类与目标类需要实现相同的接口或基类，此例中为Person类型
 * 2) 如果有多个方法需要被代理增强，则每个方法都要编写增强的代码,比如此处只有findLove方法，如果再有很多其它需要增强的方法呢
 *
 */
public class StaticProxy implements Person {

    private Person person;

    public StaticProxy(Person person){
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("我来帮你找女人！");
        this.person.findLove();
        System.out.println("找到几个合适的！");
    }
}
