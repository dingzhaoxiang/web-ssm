package com.dzx.基础.Java基础.String;

public class TestOfCotains {

	public static void main(String[] args) {
		String s1 = "asdffggg";
		String s2 = "asd";
		System.out.println(s1.contains(s2));
		CharSequence arr = "ffg";
		System.out.println(s1.contains(arr));

	}

}
