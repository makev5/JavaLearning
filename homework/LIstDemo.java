package edu.nynu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class LIstDemo {

	public static void main(String[] args) {
		//1.��������1-100�����10��
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(r.nextInt(100) + 1);
		}
		//2.����
		bubbleSort(list);
		
		//3.����
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}	
	}
	
	public static void bubbleSort(List<Integer> list){
		for(int i=0;i<list.size()-1;i++){
			for(int j=0;j<list.size()-i;j++){
				Integer a;
				if((list.get(j-1)).compareTo(list.get(j)) > 0){
					a = list.get(j-1);
					list.set((j-1), list.get(j));
					list.set(j, a);
				}
			}
		}
	}
	
}
