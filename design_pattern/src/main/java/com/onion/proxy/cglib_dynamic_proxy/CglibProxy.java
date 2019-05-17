package com.onion.proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 针对类来实现代理的，原理是对指定的业务类生成一个子类，并覆盖其中业务方法实现代理。因为采用的是继承，所以不能对final修饰的类进行代理。
 */
public class CglibProxy implements MethodInterceptor {
    // 目标对象
    private Object target;

    public Object getInstance(Object target){
        this.target = target;

        // 定义增强器
        Enhancer enhancer = new Enhancer();
        // 指定需要代理的类
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o, objects);
        after();
        return obj;
    }

    public void before(){
        System.out.println("前置方法！");
    }

    public void after(){
        System.out.println("后置方法！");
    }
}
