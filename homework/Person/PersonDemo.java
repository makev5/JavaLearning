package edu.xiaoke.test01;

public class PersonDemo {
	public static void main(String[] args) {
		BasketBallTeam basketBallTeam = new BasketBallTeam("������˶�Ա", "����ӽ���");
		basketBallTeam.eat();
		System.out.println("----------");
		
		PingPongTeam pingPongTeam = new PingPongTeam("ƹ������˶�Ա", "ƹ����ӽ���");
		pingPongTeam.eat();
		pingPongTeam.trainEnglish();
	}
}
