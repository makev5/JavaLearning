package edu.xiaoke.test;

public class Dog extends Animal implements Animal01 {
	
	// �޲ι��췽��
	public Dog() {
		super();
	}
	
	// �вι��췽��
	public Dog(String name, int age) {
		super(name, age);
	}
	
	// �Զ���ķ���
	public void frisebee(){
		System.out.println("ѵ���ӷ���");
	}

	// ʵ��Animal�������еĳ��󷽷�
	@Override
	public void shot() {
		System.out.println("������...");
		
	}
	
	// ʵ�ֽӿ�Animal01�еĳ��󷽷�
	public void eat() {
		System.out.println("�Թ�ͷ...");
		
	}

}
