package edu.xiaoke.test01;

public class PersonDemo {
	public static void main(String[] args) {
		BasketBallTeam basketBallTeam = new BasketBallTeam("篮球队运动员", "篮球队教练");
		basketBallTeam.eat();
		System.out.println("----------");
		
		PingPongTeam pingPongTeam = new PingPongTeam("乒乓球队运动员", "乒乓球队教练");
		pingPongTeam.eat();
		pingPongTeam.trainEnglish();
	}
}
