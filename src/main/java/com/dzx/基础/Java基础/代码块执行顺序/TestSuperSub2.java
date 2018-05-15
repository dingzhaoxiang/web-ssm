package com.dzx.基础.Java基础.代码块执行顺序;

class A{
	public static int k =0;
	static{
		System.out.println("父类静态块");
	}
	{
		System.out.println("父类构造块");
	}
	public A(){
		System.out.println("父类构造方法");
	}
}

class B extends A{
	static {
		System.out.println("子类静态块");
	}
	{
		System.out.println("子类构造块");
	}
	public B(){
		System.out.println("子类构造方法");
	}
}

public class TestSuperSub2 {
    public static void main(String arg[]) {
    	B b = new B();
    	System.out.println("");
    	B b2 = new B();
    }
}