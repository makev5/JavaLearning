package com.xiaoke.car;

public class Tricycle extends Car {

    public Tricycle() {
        setLunZi(3);
    }

    @Override
    public String work() {
        return "三轮车是一款有" + getLunZi() + "个轮子的非机动车。";
    }
}
