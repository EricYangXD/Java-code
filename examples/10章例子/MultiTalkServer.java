import java.io.*;
import java.net.*;
import ServerThread;

public class MultiTalkServer {
	static int clientnum = 0; // 静态成员变量，记录当前客户的个数

	public static void main(String args[]) throws IOException {
		ServerSocket serverSocket = null;
		boolean listening = true;
		try {
			serverSocket = new ServerSocket(4700);
			// 创建一个ServerSocket在端口4700监听客户请求
		} catch (IOException e) {
			System.out.println("Could not listen on port:4700.");
			// 出错，打印出错信息
			System.exit(-1); // 退出
		}
		while (listening) { // 永远循环监听
			new ServerThread(serverSocket.accept(), clientnum).start();
			// 监听到客户请求，根据得到的Socket对象和客户计数创建服务线程，并启动之
			clientnum++; // 增加客户计数
		}
		serverSocket.close(); // 关闭ServerSocket
	}
}
