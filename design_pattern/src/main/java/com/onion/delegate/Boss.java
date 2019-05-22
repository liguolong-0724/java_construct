package com.onion.delegate;

/**
 * 委派模式：
 * 委派模式中委派者（manager）要持有被委派者（staff）的引用。
 * 可以看到在实际实现中和静态代理模式稍微有点相似。实际上可以这样理解：代理模式注重的是过程，委派模式注重的是结果
 */
public class Boss {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.doing("加密");
        manager.doing("架构");
    }
}
