package com.java.sf;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer stringbuffer = new StringBuffer("zhang jin ping");
		
		/*stringbuffer 反转方法*/
		stringbuffer.reverse();
		System.out.println(stringbuffer);
		
		/*stringbuffer 删除方法*/
		stringbuffer.delete(0, 2);
		System.out.println(stringbuffer);
		
		System.out.println(stringbuffer.capacity());
	}

}
