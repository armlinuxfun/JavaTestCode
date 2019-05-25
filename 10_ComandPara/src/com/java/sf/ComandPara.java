package com.java.sf;

import java.io.IOException;

class PrintMessage {
	private int val;

	/* 注意如果这里定义了throws IOException，开发者必须自己去处理异常，见下面的try catch */
	public int getVal() throws IOException {
		return val;
	}

	public void setVal(int val) throws IOException {
		this.val = val;
	}
}

public class ComandPara {

	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++)
			System.out.println("args[" + i + "]=" + args[i]);

		PrintMessage message = new PrintMessage();

		/* 私有的变量其它类无法使用，只能通过类的方法进行访问 */
		// System.out.println("GETVAL:" + message.val);
		try {
			System.out.println("GETVAL:" + message.getVal());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
