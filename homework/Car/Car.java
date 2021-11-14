package com.xiaoke.car;

public class Car {
    private String name;
    private String color;
    private int lunZi;
    private int seat = 1;

    // 无参构造方法
    public Car() {
    }

    // 有参构造方法
    public Car(String name,String color) {
        this.name = name;
        this.color = color;
    }

    public Car(String name,String color,int lunZi,int seat) {
        this.name = name;
        this.color = color;
        this.lunZi = lunZi;
        this.seat = seat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLunZi() {
        return lunZi;
    }

    public void setLunZi(int lunZi) {
        this.lunZi = lunZi;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String work() {
        return "这是一辆" + getColor() + "颜色的，" + getName() + "牌的非机动车，有" + getLunZi() + "个轮子，有" + getSeat() + "个座椅的非机动车";
    }
}
