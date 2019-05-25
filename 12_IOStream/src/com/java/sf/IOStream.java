package com.java.sf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		/* д��������ļ� ������һ��Ҫ����try catch����ΪFileOutputStream��Ҫ���������д����쳣 */
		try {
			byte[] bWrite = { 11, 21, 3, 40, 5 };
			FileOutputStream os = new FileOutputStream("bin.dat");

			for (int x = 0; x < bWrite.length; ++x) {
				os.write(bWrite[x]);
			}
			os.close();

			FileInputStream input = new FileInputStream("bin.dat");
			int size = input.available();
			for (int x = 0; x < size; ++x) {
				System.out.print((byte) input.read() + " "); // ǿתΪbyte���;ͺ���
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n");

		/* д���ַ��� ������һ��Ҫ����try catch */
		try {
			FileOutputStream os = new FileOutputStream("test.txt");

			OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
			// ����OutputStreamWriter����,��������ָ������,Ĭ��Ϊ����ϵͳĬ�ϱ���,windows����gbk

			writer.append("��������");
			// д�뵽������

			writer.append("\r\n");
			// ����

			writer.append("English");
			// ˢ�»����,д�뵽�ļ�,��������Ѿ�û��д���������,ֱ��closeҲ��д��

			writer.close();
			// �ر�д����,ͬʱ��ѻ���������д���ļ�,���������ע�͵�
			os.close();

			FileInputStream input = new FileInputStream("test.txt");

			InputStreamReader reader = new InputStreamReader(input, "UTF-8");
			// ����InputStreamReader����,������д����ͬ

			StringBuffer sb = new StringBuffer();
			while (reader.ready()) {
				sb.append((char) reader.read());
				// ת��char�ӵ�StringBuffer������
			}
			System.out.println(sb.toString());
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
