package edu.xiaoke.test;

public class AnimalDemo {

	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.setName("²ñÈ®");
		dog.setAge(1);
		dog.shot();
		dog.eat();
		dog.frisebee();
		System.out.println("----------");
		
		Cat cat = new Cat("Ã×°Â", 2);
		cat.shot();
		cat.eat();
		cat.catchMouse();

	}

}
