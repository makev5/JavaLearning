package edu.xiaoke.test01;

public abstract class Person {
	private String sport;
	private String teacher;
	public Person(String sport, String teacher){
		this.sport = sport;
		this.teacher = teacher;
	};
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public abstract void eat();
	
}
