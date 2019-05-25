package com.java.sf;

import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date time = new Date();

		System.out.println(time.toString());

		System.out.printf("当前的日期:%tF%n", time);

		System.out.printf("当前的日期S:%1$s%n", time);

		System.out.printf("当前的日期TB:%tB%n", time);
		System.out.printf("当前的日期TD:%td%n", time);
		System.out.printf("当前的日期TY:%tY%n", time);

		/* 这里的index = 1表示后面的第一个参数 当前时间，index = 2 表示对后面的time参数进行格式化 */
		System.out.printf("%1$s %2$tY：%2$tB：%2$td", "当前时间:", time);
	}

}
