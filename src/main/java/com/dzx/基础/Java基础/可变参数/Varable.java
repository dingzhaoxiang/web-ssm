package com.dzx.基础.Java基础.可变参数;
/*Java的可变参数
1. 适用于参数个数不确定，类型确定时。
2. 只能出现在参数列表的最后。
3. Java把可变参数当做数组处理。
*/

public class Varable {
	 public static void main(String [] args){
		 System.out.println(add(2,3,3));
		 System.out.println(add(2,1));
	 }
	 
	 public static int add(int x, int ...variable){
		 int sum = x;
		 for(int i=0;i<variable.length;i++){
			 sum += variable[i];
		 }
		 return sum;
	 }
}
