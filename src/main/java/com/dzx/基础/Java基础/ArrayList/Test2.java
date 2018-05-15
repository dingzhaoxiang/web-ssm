package com.dzx.基础.Java基础.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.remove(new Integer(5));
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
			
	}

}
