package com.dzx.基础.Java基础.ArrayList;

import java.util.ArrayList;

public class TestArrayList {
	private static final int ASDF = 21654;
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
		System.out.println(list2.equals(list));//list重写了euquals方法

		ArrayList<Integer> list3= new ArrayList<>();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		System.out.println(list3.equals(list));
		Integer [] arr = list.toArray(new Integer[list.size()]);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
		Integer [] arr2 = new Integer[list.size()];
		list.toArray(arr2);
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}

}
