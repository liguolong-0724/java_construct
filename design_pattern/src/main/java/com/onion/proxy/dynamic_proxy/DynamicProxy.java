package com.onion.proxy.dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 通过反射实现动态代理：就是实现阶段不用关系代理是哪个，而在运行阶段指定具体哪个代理。
 * 被代理类一定要实现某个接口
 *
 *
 */
public class DynamicProxy implements InvocationHandler {

    // 传入的被代理对象
    private Object target;

    public DynamicProxy(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我要开始帮你找男人了！");
        // 通过反射调用目标类方法
        Object result = method.invoke(this.target,args);
        System.out.println("我找到了几个合适的！");
        return result;
    }

    /**
     * 得到目标类的代理对象，类型为目标类的接口
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
