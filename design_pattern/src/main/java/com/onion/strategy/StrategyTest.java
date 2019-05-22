package com.onion.strategy;

/**
 * 策略模式测试类
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());

        int result = context.executeStrategy(10, 5);
        System.out.println(result);
    }
}
