package com.java.sf;

public class FinalVal {
	
	public static void main(String[] arg){
	
	String a = "hello2"; 
    final String b = "hello";
    String d = "hello";
    String c = b + 2; 
    String e = d + 2;
    
    /*==是比较地址，JAVA中链接之前若字符串相同，那么其运行时在内存中的地址也是一样的*/
    System.out.println((a == c));
    System.out.println((a == e));
    
    /*equals是比较内容*/
    System.out.println(a.equals(c));
    System.out.println(a.equals(e));
	}
}
