package edu.nynu.test;

import java.util.Scanner;

public class test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------ע��------");
		System.out.print("�������û�����");
		String userName = sc.nextLine();
		String password = getPassword(userName);
		System.out.println("ע��ɹ����û�����" + userName + ",���룺" + password);
		System.out.println("------��¼------");
		boolean isLogin = Login(userName, password);
		if(isLogin){
			String newPassword = changePassword(userName, password);
			Login(userName, newPassword);
		}	
	}
	
	// �õ�����
	public static String getPassword(String userName){
		return new StringBuilder(userName).reverse().toString();
	}
	
	// ��¼
	public static boolean Login(String username, String password){
		boolean flag=false;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.print("�������û�����");
			String userName = sc.nextLine();
			System.out.print("���������룺");
			String pwd = sc.nextLine();
			if (userName.equals(username) && pwd.equals(password)) {
				System.out.println("��¼�ɹ���");
				flag = true;
				break;
			} else if(2-i!=0) {
				System.out.println("��¼ʧ�ܣ�������" + (2-i) + "�λ��ᡣ");
			} else{
				System.out.println("����˺ű�����!");
				flag = false;
			}
		}
		return flag;
	}
	
	// �޸�����
	public static String changePassword(String username, String password){
		Scanner sc = new Scanner(System.in);
		String newPassword = "";
		while(true){
			System.out.print("���޸ĳ�ʼ���룺");
			newPassword = sc.nextLine();
			if(newPassword.equals(password)){
				System.out.println("�������������һ��������������");
			}else {
				System.out.println("�����޸ĳɹ����û�����" + username + ",���룺" + newPassword);
				break;
			}
		}
		return newPassword;
	}
	
}
