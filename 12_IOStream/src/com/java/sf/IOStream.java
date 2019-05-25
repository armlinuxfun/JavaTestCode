package com.java.sf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;

		/* 写入二进制文件 ，这里一定要采用try catch，因为FileOutputStream类要求我们自行处理异常 */
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
				System.out.print((byte) input.read() + " "); // 强转为byte类型就好了
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\n");

		/* 写入字符串 ，这里一定要采用try catch */
		try {
			FileOutputStream os = new FileOutputStream("test.txt");

			OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
			// 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

			writer.append("中文输入");
			// 写入到缓冲区

			writer.append("\r\n");
			// 换行

			writer.append("English");
			// 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

			writer.close();
			// 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
			os.close();

			FileInputStream input = new FileInputStream("test.txt");

			InputStreamReader reader = new InputStreamReader(input, "UTF-8");
			// 构建InputStreamReader对象,编码与写入相同

			StringBuffer sb = new StringBuffer();
			while (reader.ready()) {
				sb.append((char) reader.read());
				// 转成char加到StringBuffer对象中
			}
			System.out.println(sb.toString());
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
