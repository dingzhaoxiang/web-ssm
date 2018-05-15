package com.dzx.基础.Java基础.HashMap;

import java.util.*;
import java.util.Map.Entry;

public class HashMapValueSort {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("张三", 70);
		map.put("李四", 60);
		map.put("王五", 90);
		map.put("赵六", 80);
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getValue());
		}
		
		List<Integer> list2 = new ArrayList<Integer>(map.values());
		Collections.sort(list2);		
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
	}
}
