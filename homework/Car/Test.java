package com.xiaoke.car;

public class Test {
    public static void main(String[] args) {
        System.out.print("父类信息测试：");
        Car car = new Car("天宇","红",4,2);
        System.out.println(car.work());

        System.out.print("自行车类信息测试：");
        Bicycle bike=new Bicycle();
        System.out.println(bike.work());

        System.out.print("电动车类信息测试：");
        ElectricVehicle evehicle=new ElectricVehicle("飞鸽");
        System.out.println(evehicle.work());

        System.out.print("三轮车类信息测试：");
        Tricycle tcycle=new Tricycle();
        System.out.println(tcycle.work());
    }
}
