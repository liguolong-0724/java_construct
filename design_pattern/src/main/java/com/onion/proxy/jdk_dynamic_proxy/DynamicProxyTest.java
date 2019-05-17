package com.onion.proxy.jdk_dynamic_proxy;

import com.onion.proxy.Person;

/**
 * 动态代理测试类
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        Person girl = new Girl();
        DynamicProxy proxy = new DynamicProxy(girl);

        // 此处一定要返回被代理对象的接口，否则会出现类型转换异常
        Person girlProxy = (Person) proxy.getProxyInstance();

        girlProxy.findLove();

    }
}
