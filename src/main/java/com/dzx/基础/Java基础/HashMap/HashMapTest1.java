package com.dzx.基础.Java基础.HashMap;

import java.util.HashMap;

public class HashMapTest1 {

	public static void main(String[] args) {
		HashMap<String , Double> map = new HashMap<String , Double>();   
		map.put("语文" , 80.0);   
		map.put("数学" , 89.0);   
		map.put("英语" , 78.2);   
		/*
		HashMap 采用一种所谓的“Hash 算法”来决定每个元素的存储位置。 

		当程序执行 map.put("语文" , 80.0); 时，
		(1)系统将调用"语文"的 hashCode() 方法得到其 hashCode 值
		(2)每个 Java对象都有 hashCode() 方法，都可通过该方法获得它的 hashCode 值。
		(3)得到这个对象的 hashCode 值之后，
		系统会根据该 hashCode 值来决定该元素的存储位置。
		(4)程序调用 hash(int h) 方法所计算得到 Hash 码值记为hash
		(5)接下来程序会调用 indexFor(int h, int length) 
		       方法来计算该对象应该保存在 table 数组的哪个索引处
		*/
		
		/*根据上面 put 方法的源代码可以看出，当程序试图将一个 key-value
		 *  对放入 HashMap 中时，程序首先根据该 key 的 hashCode() 
		 *  返回值决定该 Entry 的存储位置：如果两个 Entry 的 key 的 hashCode() 
		 *  返回值相同，那它们的存储位置相同。如果这两个 Entry 的 key 通过 equals 
		 *  比较返回 true，新添加 Entry 的 value 将覆盖集合中原有 Entry 的 value，
		 *  但 key 不会覆盖。如果这两个 Entry 的 key 通过 equals 比较返回 false，
		 *  新添加的 Entry 将与集合中原有 Entry 形成 Entry 链，而且新添加的 Entry 
		 *  位于 Entry 链的头部
		 */
		
		/* size：该变量保存了该 HashMap 中所包含的 key-value 对的数量。 
		 * 
         * threshold：该变量包含了 HashMap 能容纳的 key-value 对的极限，
         * 它的值等于 HashMap 的容量乘以负载因子（load factor）。
         * 
         * capacity: 译为容量。capacity就是指HashMap中桶的数量。
         * 默认值为16。一般第一次扩容时会扩容到64，之后好像是2倍。总之，容量都是2的幂。
         * 
         * loadFactor: 译为装载因子。装载因子用来衡量HashMap满的程度。
         * loadFactor的默认值为0.75f。
         * 计算HashMap的实时装载因子的方法为：size/capacity，
         * 而不是占用桶的数量去除以capacity。
         * 
         * 当创建 HashMap 时，有一个默认的负载因子（load factor），
         * 其默认值为 0.75，这是时间和空间成本上一种折衷：增大负载因子可以减少 Hash
         *  表（就是那个 Entry 数组）所占用的内存空间，但会增加查询数据的时间开销，
         *  而查询是最频繁的的操作（HashMap 的 get() 与 put() 方法都要用到查询）；
         *  减小负载因子会提高数据查询的性能，但会增加 Hash 表所占用的内存空间。 
         */
	}

}
