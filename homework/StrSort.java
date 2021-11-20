package edu.nynu.test;
import java.util.Arrays;
/**
 * 需求：有一个字符串：“91 27 46 38 50”
 * 实现从小到大的排序（输出结果为字符串类型）
 * 思路：
 *      定义一个字符串
 *      把字符串中的数字数据进行分割，并存储到int类型的数组中
 *      对int数组进行排序
 *      将排序后的int数组拼接得到字符串
 *      输出结果
 * */
public class StrSort {
    public static void main(String[] args) {
        // 定义一个字符串
        String s = "91 27 46 38 50";
        // 把字符串中的数字分割
        String[] arrString = s.split(" ");
        // 存储int类型的数组
        int[] arrInt = new int[arrString.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = new Integer(arrString[i]);
        }
        //对int数组排序
        Arrays.sort(arrInt);
        //将排序后的数组进行拼接到字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrInt.length; i++) {
            if (i == arrInt.length-1){
                sb.append(arrInt[i]);
            }else {
                sb.append(arrInt[i]).append(" ");
            }
        }
        //输出结果
        System.out.println(s);
        System.out.println(sb.toString());
    }
}
