package com.java.sf;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*-----------------ö��------------------*/
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		days = dayNames.elements();
		while (days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}

		/*-----------------λ����------------------*/
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		// set some bits
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 5) != 0)
				bits2.set(i);
		}
		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("\nInitial pattern in bits2: ");
		System.out.println(bits2);

		/* ��ȡ����λ������Ϊtrue */
		System.out.println(bits1.cardinality());
		System.out.println(bits2.cardinality());

		/* ��ȡindexλ�õ�λ��true����false */
		System.out.println(bits1.get(0));
		System.out.println(bits2.get(1));

		System.out.println(bits2.hashCode());

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1: ");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);

		/*-----------------λhashmap------------------*/
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print(m1 + "\n");

		Object value = m1.get("Zara");

		System.out.println(value.toString());

		List list = new ArrayList();

		list.add("qqyumidi");
		list.add("corn");

		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println("name:" + name);
		}

		String str = "Hello1 World";
		String anotherString = "Hello0 world";
		Object objStr = str;

		System.out.println(str.compareTo(anotherString));/* ���ز�ͬ���Ǹ��ַ���ֵ */

	}

}
