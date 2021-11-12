package edu.make.test;

/**
 * 乒乓球运动员类
 */
public class PingpongPlayer extends Pingpong {

    @Override
    public void tranning() {
        System.out.println("乒乓球运动员训练发球接球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("乒乓球运动员学英语");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球队吃面条");
    }

}
