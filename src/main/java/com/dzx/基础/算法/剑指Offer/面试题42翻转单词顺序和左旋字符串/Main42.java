package com.dzx.基础.算法.剑指Offer.面试题42翻转单词顺序和左旋字符串;


public class Main42 {

	public static void main(String[] args) {
		String str = "I am a student.";
		System.out.println(reverse1(str));
		System.out.println(reverse1_1(str));
		System.out.println(reverse2("Hello World"));

	}
	
	//翻转的是单词的顺序 
	public static String reverse1(String str){
		if(str==null||str.length()==0||str.length()==1) return str;
		StringBuffer sb1 = new StringBuffer(str);
	    String [] arr = sb1.reverse().toString().split(" ");
	    StringBuffer res = new StringBuffer();
	    for(int i=0;i<arr.length-1;i++){
	        res.append((new StringBuffer(arr[i])).reverse().toString());
	        res.append(" ");
	    }
	    res.append((new StringBuffer(arr[arr.length-1])).reverse().toString());
	    return res.toString();
	}
	
	public static String reverse1_1(String str){
		if(str==null||str.length()==0||str.length()==1) return str;		
	    String [] arr = str.split(" ");
	    StringBuffer res = new StringBuffer();
	    for(int i=arr.length-1;i>0;i--){
	    	res.append(arr[i]);
	    	res.append(" ");
	    }
	    res.append(arr[0]);
	    return res.toString();
	}
	
	//只翻转单词
	public static String reverse2(String str){
		String [] arr = str.split(" ");
		StringBuffer res = new StringBuffer();
		for(int i=0;i<arr.length-1;i++){
			res.append(new StringBuffer(arr[i]).reverse().toString());
			res.append(" ");
		}
		res.append(new StringBuffer(arr[arr.length-1]).reverse().toString());
		return res.toString();
	}

}
