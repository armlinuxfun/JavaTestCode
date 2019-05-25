package com.java.sf;

public class ObjectMethod {
	int val;
	public static byte a = -1;
	private int b;

	public ObjectMethod(String arg) {
		System.out.println("arg:" + arg);
	}
	
	public ObjectMethod() {
		System.out.println("arg:");
	}
	
	public void set_val(int val) {
		this.val = val;
		this.b = val;
	}
	public int get_val() {
		return this.val;
	}
	
	public void val_no_init() {
		byte i = 0;
		i = (byte)(i + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the object method test demo\n");
		
		/*调用类中有参数的构造函数*/
		ObjectMethod objct_test = new ObjectMethod("test");
		
		/*调用类中无参数的构造函数*/
		ObjectMethod objct_test1 = new ObjectMethod();
		
		/*访问该类中的私有变量*/
		objct_test.b = 0;
		
		/*对于变量,最好采用类名的方式访问,也可以采用对象名的方式访问*/
		ObjectMethod.a = 20;
		System.out.println("a:" + ObjectMethod.a);
		
		/*访问该类中的变量*/
		objct_test.set_val(10);
		
		System.out.println("val:" + objct_test.get_val());
		System.out.println("val:" + objct_test.val);
		System.out.println("b:" + objct_test.b);
		
		System.out.println("val:" + objct_test1.val);
		
		/*访问外部类*/
		ExternMethod extern_method = new ExternMethod();
		
		/*不能引用其它类的私有变量*/
		//extern_method.val = 0;
		
		/*可通过调用其它类的公共方法访问类的私有变量*/
		extern_method.set_val(0);
	}

}
