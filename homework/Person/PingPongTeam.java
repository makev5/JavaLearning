package edu.xiaoke.test01;

public class PingPongTeam extends Person implements Person01 {

	public PingPongTeam(String sport, String teacher) {
		super(sport, teacher);
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("³ÔÆ»¹û");
		
	}

	public void trainEnglish() {
		// TODO Auto-generated method stub
		System.out.println("ÑµÁ·Ó¢Óï");
		
	}

}
