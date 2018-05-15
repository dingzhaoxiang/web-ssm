package com.dzx.基础.Java基础.Arrays;

import java.util.Arrays;

public class TestOfSort {

	public static void main(String[] args) {
		int [] arr = {1,3,6,2,4,8,5,7};
		Arrays.sort(arr,2,arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
