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
		
		/*���������в����Ĺ��캯��*/
		ObjectMethod objct_test = new ObjectMethod("test");
		
		/*���������޲����Ĺ��캯��*/
		ObjectMethod objct_test1 = new ObjectMethod();
		
		/*���ʸ����е�˽�б���*/
		objct_test.b = 0;
		
		/*���ڱ���,��ò��������ķ�ʽ����,Ҳ���Բ��ö������ķ�ʽ����*/
		ObjectMethod.a = 20;
		System.out.println("a:" + ObjectMethod.a);
		
		/*���ʸ����еı���*/
		objct_test.set_val(10);
		
		System.out.println("val:" + objct_test.get_val());
		System.out.println("val:" + objct_test.val);
		System.out.println("b:" + objct_test.b);
		
		System.out.println("val:" + objct_test1.val);
		
		/*�����ⲿ��*/
		ExternMethod extern_method = new ExternMethod();
		
		/*���������������˽�б���*/
		//extern_method.val = 0;
		
		/*��ͨ������������Ĺ��������������˽�б���*/
		extern_method.set_val(0);
	}

}
