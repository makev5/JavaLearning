package com.xiaoke.test;

import java.util.Random;

public class StudentDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		Student[] student = new Student[4];
		student[0] =  new Student(10001, "����",  20);
		student[1] =  new Student(10001, "����",  18);
		student[2] =  new Student(10001, "����",  19);
		student[3] =  new Student(10001, "����",  21);
		Random r = new Random();
		int idx = r.nextInt(4);
		stu = student[idx];
		stu.show();
	}

}
