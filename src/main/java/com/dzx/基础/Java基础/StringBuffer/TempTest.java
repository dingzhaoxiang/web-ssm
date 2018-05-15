package com.dzx.基础.Java基础.StringBuffer;

public class TempTest {

	public static void main(String[] args) {
		StringBuffer [] sbArr = new StringBuffer[5];
		//定义了一个StringBuffer类型的数组
		//使用之前要先初始化
		sbArr[0] = new StringBuffer();
		sbArr[1] = new StringBuffer();
		String s = "asfsfgth";
		sbArr[0].append(s.charAt(1));
		sbArr[1].append(s.charAt(2));
		sbArr[0].append(sbArr[1]);
		sbArr[0].append(s);
		System.out.println(sbArr[0].toString());
		
	}

}
