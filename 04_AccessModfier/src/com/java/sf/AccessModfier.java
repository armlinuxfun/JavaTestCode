package com.java.sf;

public class AccessModfier {
	
	public interface InterfaceTest{
		public void fun();
	}
	
	/*protected�����������νӿ���*/
	/*
	 * protected interface InterfaceTest{ public void fun() {
	 * 
	 * } }
	 */
	
	private void SetVal() {
		System.out.println("This is the access modifier code of setval\n");
	}
	
	public void GetVal() {
		System.out.println("This is the access modifier code of getval\n");
	}
	
	protected void Test() {
		System.out.println("This is the access modifier code of test\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModfier accessmodfier = new AccessModfier();
		
		/*�������Զ���Ϊpublic������private*/
		accessmodfier.SetVal();
		accessmodfier.GetVal();
		accessmodfier.Test();
	}

}

