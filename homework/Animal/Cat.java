package edu.xiaoke.test;

public class Cat extends Animal implements Animal01 {
	
	// �޲ι��췽��
	public Cat() {
		super();
	}
	
	// �вι��췽��
	public Cat(String name, int age) {
		super(name, age);
	}

	// ʵ�ֽӿ�Animal01�еĳ��󷽷�
	public void eat() {
		System.out.println("è����...");
		
	}
	
	// ʵ�ֳ�����Animal�еĳ��󷽷�
	@Override
	public void shot() {
		System.out.println("����è...");
	}
	
	// �Զ���ķ���
	public void catchMouse(){
		System.out.println("ѵ��ץ����");
	}

}
