package com.xiaoke.str;

import java.util.Random;
import java.util.Scanner;

/**
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
 * 验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
 * 在判断验证码时一般不区分大小写。
 * 请编写程序模拟验证码的判断过程，如果输入正确，
 * 给出提示，结束程序。如果输入错误，给出提示，验证码刷新，重新输入，直至正确为止。
 */
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String code = getCode();
            System.out.println("您得到的随机验证码：" + code);
            System.out.print("请输入验证码：");
            String input = sc.nextLine();
            // 不区分大小写
            if (input.toLowerCase().equals(code.toLowerCase())){
                System.out.println("验证通过！");
                break;
            }else{
                System.out.println("验证失败！");
            }
        }
    }

    // 定义一个生成验证码的方法
    public static String getCode() {
        Random random = new Random();
        // 大写
        StringBuilder AZ = new StringBuilder();
        // 小写
        StringBuilder az = new StringBuilder();
        // 数字
        StringBuilder number = new StringBuilder();
        //A-Z 65-90 得到大写的字符串
        for (char i = 65; i <= 90; i++) {
            AZ.append(i);
        }
        // a-z 97-122 得到小写的字符串
        for (char i = 97; i <= 122; i++) {
            az.append(i);
        }
        // 得到0-9的字符串
        for (int i = 0; i <= 9; i++) {
            number.append(i);
        }
        // 拼接大小写字母和数字
        String codeStr = AZ.toString() + az.toString() + number.toString();
        // 字符串转char数组
        char[] c = codeStr.toCharArray();
        // 0-61
        // random.nextInt 该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n。
        String code = "";
        // 随机生成四个字符并拼接得到code
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(62);
            code += c[index];
        }
        return code;
    }
}
