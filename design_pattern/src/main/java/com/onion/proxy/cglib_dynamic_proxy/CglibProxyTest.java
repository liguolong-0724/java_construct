package com.onion.proxy.cglib_dynamic_proxy;


public class CglibProxyTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
        CglibProxy proxy = new CglibProxy();

        Girl girlProxy = (Girl)proxy.getInstance(girl);

        girlProxy.findLove();
    }
}
