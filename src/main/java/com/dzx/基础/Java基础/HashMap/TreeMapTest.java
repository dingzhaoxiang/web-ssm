package com.dzx.基础.Java基础.HashMap;

import java.util.Iterator;
import java.util.TreeMap;

//基于红黑树实现
public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String,String> map = new TreeMap<String, String>();
		map.put("c", "sdasf");
		map.put("b", "sdasf");
		map.put("a", "sdasf");
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext()){
			String key = i.next();
			System.out.println(key+":"+map.get(key));
		}
		
	}

}
