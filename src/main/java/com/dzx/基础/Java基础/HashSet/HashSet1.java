package com.dzx.基础.Java基础.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*对于 HashSet 而言，它是基于 HashMap 实现的，
	 * HashSet 底层采用 HashMap 来保存所有元素
	 */
	
	/* 由上面源程序可以看出，HashSet 的实现其实非常简单，
	 * 它只是封装了一个 HashMap 对象来存储所有的集合元素，
	 * 所有放入 HashSet 中的集合元素实际上由 HashMap 的 key 来保存，
	 * 而 HashMap 的 value 则存储了一个 PRESENT，它是一个静态的 Object 对象。
	 *  */

}
