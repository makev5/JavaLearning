package com.make.study;
/*
需求：
    我国古代数学家张丘建在《算经》一书中提出的数学问题：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
    百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？

思路：
    1:第1层循环，用于表示鸡翁的范围，初始化表达式的变量定义为 x=0，判断条件是x<=20
    2:第2层循环，用于表示鸡母的范围，初始化表达式的变量定义为 y=0，判断条件是y<=33
    3:这个时候，用于表示鸡雏的变量 z = 100 – x – y
    4:判断表达式 z%3==0 和表达式 5*x + 3*y + z/3 = 100 是否同时成立，如果成立，输出对应的 x，y，z 的值，
      就是对应的鸡翁，鸡母，鸡雏的值
*/
public class Chicken {
	public static void main(String[] args) {
		System.out.println("鸡翁\t鸡母\t鸡雏");
	    for (int x = 0; x <= 20; x++) {
			for (int y = 0; y <= 33; y++) {
				int z = 100 - x - y;
				if(z%3==0 & 5*x + 3*y + z/3==100){
					System.out.println(x + "\t"  + y + "\t" + z);
				}
			}
		}
	}
}