package com.java.sf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpIp {
	public static void main(String[] args) {
		String serverName = args[0];
		int port = Integer.parseInt(args[1]);
		try {
			System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
			Socket client = new Socket(serverName, port);
			System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);

			System.out.println(client.getLocalSocketAddress());

			out.writeUTF("Hello from " + client.getLocalSocketAddress());

			int i = 0;

			while (true) {
				InputStream inFromServer = client.getInputStream();
				DataInputStream in = new DataInputStream(inFromServer);
				System.out.println("服务器响应： " + in.readUTF());
				i++;
				if (i > 10)
					break;
			}
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
