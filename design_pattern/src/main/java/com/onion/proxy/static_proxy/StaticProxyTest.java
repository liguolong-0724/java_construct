package com.onion.proxy.static_proxy;

/**
 * 测试静态代理类
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        new StaticProxy(new Man()).findLove();
    }
}
