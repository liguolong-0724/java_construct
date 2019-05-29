package com.onion.direct;

/**
 * 使用建造者模式组装电脑
 */
public class Computer {
    // 必选参数
    private String mainBoard ;     // 主板
    private String cpu ;           // cpu
    private String hd ;            // 硬盘
    private String powerSupplier ; // 电源
    private String graphicsCard;   // 显卡


    // 其它一些可选参数
    private String mouse ; // 鼠标
    private String computerCase ; //机箱
    private String mousePad ;   //鼠标垫
    private String other ;  //其它配件

    public Computer(ComputerBuilder builder) {
        this.mainBoard = builder.mainBoard ;
        this.cpu = builder.cpu ;
        this.hd = builder.hd ;
        this.powerSupplier = builder.powerSupplier ;
        this.graphicsCard = builder.graphicsCard ;

        this.mouse = builder.mouse ;
        this.computerCase = builder.computerCase ;
        this.mousePad = builder.mousePad ;
        this.other = builder.other ;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hd='" + hd + '\'' +
                ", powerSupplier='" + powerSupplier + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", computerCase='" + computerCase + '\'' +
                ", mousePad='" + mousePad + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    /**
     * 此处可以有多个内部类，代表不同品牌电脑的建造者
     */
    public static class ComputerBuilder{
        // 一个电脑的必须配置
        private String mainBoard ;     // 主板
        private String cpu ;           // cpu
        private String hd ;            // 硬盘
        private String powerSupplier ; // 电源
        private String graphicsCard;   // 显卡

        // 其它一些可选配置
        private String mouse ; // 鼠标
        private String computerCase ; //机箱
        private String mousePad ;   //鼠标垫
        private String other ;  //其它配件

        // 这里声明一些必须要传的参数「规定这些参数是必须传的，这里只是举例，现实中可能参数都是可选的」
        public ComputerBuilder(String mainBoard,String cpu,String hd,String powerSupplier,String graphicsCard){
            this.mainBoard = mainBoard ;
            this.cpu = cpu ;
            this.hd = hd ;
            this.powerSupplier = powerSupplier ;
            this.graphicsCard = graphicsCard ;
        }

        // 生成最终的产品
        public Computer build(){
            return new Computer(this) ;
        }

        public String getMainBoard() {
            return mainBoard;
        }

        public ComputerBuilder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public String getCpu() {
            return cpu;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public String getHd() {
            return hd;
        }

        public ComputerBuilder setHd(String hd) {
            this.hd = hd;
            return this;
        }

        public String getPowerSupplier() {
            return powerSupplier;
        }

        public ComputerBuilder setPowerSupplier(String powerSupplier) {
            this.powerSupplier = powerSupplier;
            return this;
        }

        public String getGraphicsCard() {
            return graphicsCard;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public String getMouse() {
            return mouse;
        }

        public ComputerBuilder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public String getComputerCase() {
            return computerCase;
        }

        public ComputerBuilder setComputerCase(String computerCase) {
            this.computerCase = computerCase;
            return this;
        }

        public String getMousePad() {
            return mousePad;
        }

        public ComputerBuilder setMousePad(String mousePad) {
            this.mousePad = mousePad;
            return this;
        }

        public String getOther() {
            return other;
        }

        public ComputerBuilder setOther(String other) {
            this.other = other;
            return this;
        }
    }

}
