package edu.xiaoke.test;

public class Dog extends Animal implements Animal01 {
	
	// 无参构造方法
	public Dog() {
		super();
	}
	
	// 有参构造方法
	public Dog(String name, int age) {
		super(name, age);
	}
	
	// 自定义的方法
	public void frisebee(){
		System.out.println("训练接飞盘");
	}

	// 实现Animal抽象类中的抽象方法
	@Override
	public void shot() {
		System.out.println("汪汪汪...");
		
	}
	
	// 实现接口Animal01中的抽象方法
	public void eat() {
		System.out.println("吃骨头...");
		
	}

}
