package com.onion.direct;

public class DirectPatterTest {
    public static void main(String[] args) {
        // 使用建造者模式
        Computer computer = new Computer.ComputerBuilder("主板","cpu","hd","电源","显卡")
                .setMouse("鼠标").setOther("都要高配的").build();
        System.out.println("使用建造者模式组装电脑：" + computer.toString());
    }
}
