package com.xiaoke.car;

public class Bicycle extends Car {
    public Bicycle() {
        super("黄色","捷安特");
    }

    @Override
    public String work() {
        return "这是一辆" + getColor() + "颜色的，" + getName() + "牌的自行车。";
    }

}
