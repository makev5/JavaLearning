package edu.nynu.test;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------注册------");
		System.out.print("请输入用户名：");
		String userName = sc.nextLine();
		String password = getPassword(userName);
		System.out.println("注册成功！用户名：" + userName + ",密码：" + password);
		System.out.println("------登录------");
		boolean isLogin = Login(userName, password);
		if(isLogin){
			String newPassword = changePassword(userName, password);
			Login(userName, newPassword);
		}	
	}
	
	// 得到密码
	public static String getPassword(String userName){
		return new StringBuilder(userName).reverse().toString();
	}
	
	// 登录
	public static boolean Login(String username, String password){
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.print("请输入用户名：");
			String userName = sc.nextLine();
			System.out.print("请输入密码：");
			String pwd = sc.nextLine();
			if (userName.equals(username) && pwd.equals(password)) {
				System.out.println("登录成功！");
				flag = true;
				break;
			} else if(2-i!=0) {
				System.out.println("登录失败，您还有" + (2-i) + "次机会。");
			} else{
				System.out.println("你的账号被锁定!");
				flag = false;
			}
		}
		return flag;
	}
	
	// 修改密码
	public static String changePassword(String username, String password){
		Scanner sc = new Scanner(System.in);
		String newPassword = "";
		while(true){
			System.out.print("请修改初始密码：");
			newPassword = sc.nextLine();
			if(newPassword.equals(password)){
				System.out.println("新密码与旧密码一样，请重新输入");
			}else {
				System.out.println("密码修改成功，用户名：" + username + ",密码：" + newPassword);
				break;
			}
		}
		return newPassword;
	}
	
}
