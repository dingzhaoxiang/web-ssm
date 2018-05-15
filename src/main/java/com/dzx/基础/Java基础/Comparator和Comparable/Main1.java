package com.dzx.基础.Java基础.Comparator和Comparable;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		Integer [] arr = {new Integer(2),new Integer(1)};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
