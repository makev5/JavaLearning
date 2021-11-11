package edu.xiaoke.test;

public class Cat extends Animal implements Animal01 {
	
	// 无参构造方法
	public Cat() {
		super();
	}
	
	// 有参构造方法
	public Cat(String name, int age) {
		super(name, age);
	}

	// 实现接口Animal01中的抽象方法
	public void eat() {
		System.out.println("猫吃鱼...");
		
	}
	
	// 实现抽象类Animal中的抽象方法
	@Override
	public void shot() {
		System.out.println("喵喵猫...");
	}
	
	// 自定义的方法
	public void catchMouse(){
		System.out.println("训练抓老鼠");
	}

}
