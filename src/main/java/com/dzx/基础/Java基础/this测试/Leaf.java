package com.dzx.基础.Java基础.this测试;

public class Leaf {
	int i = 0;
	Leaf(int i){
		this.i = i;
	}
	Leaf increment(){
		i++;
		return this;
	}
	void print(){
		System.out.println("i= "+i);
	}
	public static void main(String[] args) {
		Leaf leaf = new Leaf(100);
		leaf.increment().increment().print();
	}

}
