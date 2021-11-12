package edu.make.test;

/**
 * 测试类
 */
public class Demo {
    public static void main(String[] args) {
        BaskballCoach bc = new BaskballCoach();
        BaskballPlayer bp = new BaskballPlayer();
        bc.setName("郭艾伦");
        bc.setAge(25);
        System.out.println(bc.getName() + "," + bc.getAge());
        bc.tranning();
        bc.eat();
        bp.tranning();
        bp.eat();

        PingpongCoach pc = new PingpongCoach();
        PingpongPlayer pp = new PingpongPlayer();
        pc.setName("刘国梁");
        pc.setAge(40);
        System.out.println(pc.getName() + "," + pc.getAge());
        pc.tranning();
        pc.eat();
        pc.learnEnglish();
        pp.tranning();
        pp.eat();
        pp.learnEnglish();

    }
}
