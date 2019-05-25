package com.java.sf;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMatch {

	static boolean checkQQ(String str) {
		/* �����ʾ��һ��������1-9֮�䣬{4��15}��ʾǰ���[0-9]���ٳ���4�Σ�������15�� */
		String regex = "[1-9][0-9]{4,15}";
		return str.matches(regex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ret;

		ret = checkQQ(args[0]);
		if (ret == true)
			System.out.println("QQ��У����ȷ");
		else
			System.out.println("QQ��У�����");

		/* �����.��ʾ�����ַ���\r\n,*��ʾǰ����ַ�����0�λ��� */
		String regular = "(.* )(.* )(.* )(.* )(.*)";
		String input = "This the regular match demo\n";

		Pattern patt = Pattern.compile(regular);

		Matcher mat = patt.matcher(input);

		mat.find();

		System.out.println("Match group:" + mat.groupCount());

		System.out.println("group[0]:" + mat.group(0));
		System.out.println("group[1]:" + mat.group(1));
		System.out.println("group[2]:" + mat.group(2));
		System.out.println("group[3]:" + mat.group(3));
		System.out.println("group[4]:" + mat.group(4));
		System.out.println("group[5]:" + mat.group(5));

		/* ��������������Ŀ���࣬ע������Ŀ�Ҽ�---����--java build path�����projects��������������Ŀ��Ŀ¼���� */
		com.java.sf.PrintMessage message = new PrintMessage();

		/* ˽�еı����������޷�ʹ�ã�ֻ��ͨ����ķ������з��� */
		// System.out.println("GETVAL:" + message.val);
		try {
			System.out.println("GETVAL:" + message.getVal());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
