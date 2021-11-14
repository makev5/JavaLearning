package com.xiaoke.car;

public class ElectricVehicle extends Car{
    private String battery;     // 电池品牌

    // 无参构造方法
    public ElectricVehicle() {

    }

    // 有参构造方法
    public ElectricVehicle(String battery) {
        this.battery=battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }


    @Override
    public String work() {
        return "这是一辆使用"+ getBattery() +"牌电池的电动车";
    }
}
