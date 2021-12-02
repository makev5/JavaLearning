package com.xiaoke.list;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListDemo {
    public static void main(String[] args) {
        //1.存入数据1-100中随机10个
        Random r = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(r.nextInt(100) + 1);
        }
        //2.排序
        bubbleSort(list);
        //3.遍历
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
    }
    //冒泡排序
    public static void bubbleSort(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if (list.get(j)>list.get(j+1)){
                    int temp = list.get(j+1);
                    list.set(j+1,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
}

