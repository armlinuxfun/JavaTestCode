package com.java.sf;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date time = new Date();

		System.out.println(time.toString());

		System.out.printf("��ǰ������:%tF%n", time);

		System.out.printf("��ǰ������S:%1$s%n", time);

		System.out.printf("��ǰ������TB:%tB%n", time);
		System.out.printf("��ǰ������TD:%td%n", time);
		System.out.printf("��ǰ������TY:%tY%n", time);

		/* �����index = 1��ʾ����ĵ�һ������ ��ǰʱ�䣬index = 2 ��ʾ�Ժ����time�������и�ʽ�� */
		System.out.printf("%1$s %2$tY��%2$tB��%2$td", "��ǰʱ��:", time);
	}

}
