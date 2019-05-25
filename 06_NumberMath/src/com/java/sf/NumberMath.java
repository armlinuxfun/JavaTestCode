package com.java.sf;

public class NumberMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*toString是包装类中的方法*/
		String j = Integer.toString(5);
		System.out.println(j);
		
		
		/*这是一个包装类*/
		Integer k = Integer.valueOf(10);
		System.out.println(k);
		
		/*调用random方法*/
		System.out.println(Math.random());
		
		/*调用Math函数*/
		System.out.println(Math.cos(0));
		
		/*java中的转义字符*/
		System.out.println("这是一个\"测试\"程序");
		
		
		/*string类中的concat函数*/
		String name = "jp".concat("zhang");
		System.out.println(name);
	
	}

}
