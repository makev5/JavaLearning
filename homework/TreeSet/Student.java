package com.xiaoke.map;

public class Student implements Comparable<Student>{
	private String name;
	private int mathGrade;
	private int chinaGrade;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int mathGrade, int chinaGrade) {
		super();
		this.name = name;
		this.mathGrade = mathGrade;
		this.chinaGrade = chinaGrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMathGrade() {
		return mathGrade;
	}
	public void setMathGrade(int mathGrade) {
		this.mathGrade = mathGrade;
	}
	public int getChinaGrade() {
		return chinaGrade;
	}
	public void setChinaGrade(int chinaGrade) {
		this.chinaGrade = chinaGrade;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chinaGrade;
		result = prime * result + mathGrade;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	public int totalGrade(){
		return mathGrade + chinaGrade;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (chinaGrade != other.chinaGrade)
			return false;
		if (mathGrade != other.mathGrade)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
	
	
		return 0;
	}
	
	
	
	

}
