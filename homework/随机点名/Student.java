package com.xiaoke.test;

public class Student {
	private int Sno;
	private String Sname;
	private int Sage;
	
	public Student(int Sno, String Sname, int Sage) {
		// TODO Auto-generated constructor stub
		this.Sno = Sno;
		this.Sname = Sname;
		this.Sage = Sage;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getSno() {
		return Sno;
	}

	public void setSno(int sno) {
		Sno = sno;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public int getSage() {
		return Sage;
	}

	public void setSage(int sage) {
		Sage = sage;
	}
	
	public void show() {
		System.out.println("被随机点名到的是：\n" + "学号：" + getSno() + "," + "姓名：" + getSname() + "," + "年龄：" + getSage());

	}
}
