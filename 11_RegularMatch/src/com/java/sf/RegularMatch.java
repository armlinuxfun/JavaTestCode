package com.java.sf;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularMatch {

	static boolean checkQQ(String str) {
		/* 这里表示第一个数字在1-9之间，{4，15}表示前面的[0-9]至少出现4次，最多出现15次 */
		String regex = "[1-9][0-9]{4,15}";
		return str.matches(regex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ret;

		ret = checkQQ(args[0]);
		if (ret == true)
			System.out.println("QQ号校验正确");
		else
			System.out.println("QQ号校验错误");

		/* 这里的.表示单个字符除\r\n,*表示前面的字符出现0次或多次 */
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

		/* 这里引用其它项目的类，注意在项目右键---属性--java build path下面的projects下面增加其它项目的目录即可 */
		com.java.sf.PrintMessage message = new PrintMessage();

		/* 私有的变量其它类无法使用，只能通过类的方法进行访问 */
		// System.out.println("GETVAL:" + message.val);
		try {
			System.out.println("GETVAL:" + message.getVal());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
