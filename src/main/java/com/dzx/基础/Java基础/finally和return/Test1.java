package com.dzx.基础.Java基础.finally和return;

public class Test1 {

	public static void main(String[] args) {
		/*
		 *  1、不管有木有出现异常，finally块中代码都会执行；
		 *	2、当try和catch中有return时，finally仍然会执行；
		 *  3、finally是在return后面的表达式运算后执行的
		 *  （此时并没有返回运算后的值，而是先把要返回的值保存起来，
		 *   不管finally中的代码怎么样，返回的值都不会改变，任然是之前保存的值），
		 *   所以函数返回值是在finally执行前确定的；
		 *	4、finally中最好不要包含return，否则程序会提前退出，
		 *   返回值不是try或catch中保存的返回值。
		 */
		System.out.println(test4());

	}
	//情况1，try{} catch(){}finally{} return;
    //显然程序按顺序执行。
	public static String  test1(){
		int b =10;
		try{
			int a = 1/0;
			System.out.println("try");
			//return "try";
		}catch(Exception e){
			//return "catch"+" exception";
			System.out.println("catch");
		}
		finally{
			//return "finally";
			System.out.println("excute finally");
		}
		return "can be excuted";
	}
	//情况2，try{ return; }catch(){} finally{} return;
	//如果在return中的try发生之前就有异常，return就不会执行
	//否则，先执行finally后return
	public static String  test2(){
		int b =10;
		try{
			//int a = 1/0;
			int a  = 1;
			return "try"+b;
		}catch(Exception e){
			//return "catch"+" exception";
			System.out.println("catch");
		}
		finally{
			//return "finally";
			System.out.println("excute finally");
			b = 11;
		}
		return "can be excuted";
	}
	
	//情况3:try{ } catch(){return;} finally{} return;
	/* 有异常：则执行catch中return之前
	 *（包括return语句中的表达式运算）代码，
	 * 再执行finally语句中全部代码，
              最后执行catch块中return. 
       finally之后也就是4处的代码不再执行。
             无异常：执行完try再finally再return.*/
	public static String  test3(){
		int b =10;
		try{
			int a = 1/0;
			//int a  = 1;


		}catch(Exception e){
			System.out.println("catch");
			return "catch"+" exception";
			

		}
		finally{
			//return "finally";
			System.out.println("excute finally");
			b = 11;
		}
		return "can be excuted";
	}
	/*情况4:try{ return; }catch(){} finally{return;}
            程序执行try块中return之前（包括return语句中的表达式运算）代码；
            再执行finally块，因为finally块中有return所以提前退出。
            此时return的结果是在fianlly中改变的
    */
	public static String  test4(){
		int b =10;
		try{
			//int a = 1/0;
			int a  = 1;
			System.out.println("excute try");
			return "try"+b;
		}catch(Exception e){
			//return "catch"+" exception";
			System.out.println("catch");
		}
		finally{
			//return "finally";
			System.out.println("excute finally");
			b = 11;
			return "finally"+b;
		}
		
	}
	/*情况5:try{} catch(){return;}finally{return;}
          程序执行catch块中return之前（包括return语句中的表达式运算）代码；
          再执行finally块，因为finally块中有return所以提前退出。
    */
	
	/*情况6:try{ return;}catch(){return;} finally{return;}
          程序执行try块中return之前（包括return语句中的表达式运算）代码；
          有异常：执行catch块中return之前（包括return语句中的表达式运算）代码；
                       则再执行finally块，因为finally块中有return所以提前退出。
          无异常：则再执行finally块，因为finally块中有return所以提前退出。
    */
	
}
