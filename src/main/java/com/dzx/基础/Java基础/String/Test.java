package com.dzx.基础.Java基础.String;

public class Test {

	public static void main(String[] args) {
	
	        String s1 = "a";  
	        String s2 = "b";  
	        String s3 = "ab";  
	          
	        String s4 = "ab";  
	        System.out.println("s3==s4? "+ (s3==s4));  
	      
	        //两个常量相加，所以编译器会把s5="a"+"b"优化为s5="ab"。
	        //所以结果也为true。
	        String s5 = "a"+"b";  
	        System.out.println("s3==s5? "+ (s3==s5));  
	        
	        //s3与s6由于是两个变量的相加所以编译器无法优化
	        String s6 = s1+s2;  
	        System.out.println("s3==s6? "+ (s3==s6));  
	         
	        //s3与s7，根据缓冲池的定义在new的时候实际会新分配地址空间,
	        //s7指向的是新分配的地址空间所以与缓冲池地址不同，所以为false
	        String s7 = new String("ab");  
	        System.out.println("s3==s7? "+ (s3==s7));
	        
	        /*当调用 intern 方法时，如果池已经包含一个等于此 String 对象的字符串
	         * （该对象由 equals(Object) 方法确定），则返回池中的字符串。
	         * 否则，将此 String 对象添加到池中，并且返回此 String 对象的引用。*/
	        String s7_1 = new String("ab").intern();
	        System.out.println("s3==s7_1? "+ (s3==s7_1));
	          
	        //s3与s10，类似于s3与s5，由于是final类型编译器进行了优化所以相同。
	        final String s8 = "a" ;   
	        final String s9 = "b" ;  
	        String s10 = s8 + s9;  
	        System.out.println("s3==s10? "+ (s3==s10));  
	        }  
	
	/*总结
	 *    情况一
	 * 	String s1 = "s"; // 创建了一个对象;
		//情况二
		s1 = new String("s"); //创建了两个对象
		//情况三
			String s2 = new String("a" + s1); //创建了三个对象*/
}
