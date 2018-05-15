package com.dzx.基础.Java基础.代码块执行顺序;

public class TestStatic {

	static int cnt = 6;
	static{
		System.out.println("执行静态块1");
		cnt += 9;
	}
	public static void main(String[] args) {
		System.out.println("cnt = "+cnt);

	}
	static {
		System.out.println("执行静态块2");
		cnt /=3;
	}

}
