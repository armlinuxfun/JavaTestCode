package com.java.sf;

public class FinalVal {
	
	public static void main(String[] arg){
	
	String a = "hello2"; 
    final String b = "hello";
    String d = "hello";
    String c = b + 2; 
    String e = d + 2;
    
    /*==�ǱȽϵ�ַ��JAVA������֮ǰ���ַ�����ͬ����ô������ʱ���ڴ��еĵ�ַҲ��һ����*/
    System.out.println((a == c));
    System.out.println((a == e));
    
    /*equals�ǱȽ�����*/
    System.out.println(a.equals(c));
    System.out.println(a.equals(e));
	}
}
