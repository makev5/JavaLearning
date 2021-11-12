package edu.make.test;

/**
 *  乒乓球教练类
 */
public class PingpongCoach extends Pingpong {

    @Override
    public void tranning() {
        System.out.println("乒乓球教练教接球发球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球教练学英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃面条青菜");
    }
}
