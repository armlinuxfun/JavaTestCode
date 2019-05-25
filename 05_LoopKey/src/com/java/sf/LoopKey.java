package com.java.sf;

public class LoopKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {1,2,3,4};
		
		/*可以看到这里的用法跟C语言的for循环的差别*/
		for(int i:num) {
			System.out.println("This is a for key code:" + i);
		}
	}

}
