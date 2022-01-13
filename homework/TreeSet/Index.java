package com.xiaoke.map;

import java.util.Comparator;
import java.util.TreeSet;

public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
			
			@Override
			public int compare(Student stu1, Student stu2) {
				int num1 = stu2.totalGrade() - stu1.totalGrade();
				int num2 = num1==0 ? stu2.getMathGrade() - stu1.getMathGrade() : num1;
				return num2;
			};
		});
		ts.add(new Student("张三", 96, 90));
		ts.add(new Student("李四", 89, 80));
		ts.add(new Student("王五", 96, 92));
		ts.add(new Student("赵六", 100, 86));
		
		
		for(Student stu: ts){
			System.out.println(stu.getName() + "," + stu.getMathGrade() + "," + stu.getChinaGrade());
		}
		

	}

}
