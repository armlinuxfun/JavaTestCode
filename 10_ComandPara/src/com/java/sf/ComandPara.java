package com.java.sf;

import java.io.IOException;

class PrintMessage {
	private int val;

	/* ע��������ﶨ����throws IOException�������߱����Լ�ȥ�����쳣���������try catch */
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

		/* ˽�еı����������޷�ʹ�ã�ֻ��ͨ����ķ������з��� */
		// System.out.println("GETVAL:" + message.val);
		try {
			System.out.println("GETVAL:" + message.getVal());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
