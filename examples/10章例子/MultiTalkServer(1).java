import java.io.*;
import java.net.*;
import ServerThread;

public class MultiTalkServer {
	static int clientnum = 0; // ��̬��Ա��������¼��ǰ�ͻ��ĸ���

	public static void main(String args[]) throws IOException {
		ServerSocket serverSocket = null;
		boolean listening = true;
		try {
			serverSocket = new ServerSocket(4700);
			// ����һ��ServerSocket�ڶ˿�4700�����ͻ�����
		} catch (IOException e) {
			System.out.println("Could not listen on port:4700.");
			// ������ӡ������Ϣ
			System.exit(-1); // �˳�
		}
		while (listening) { // ��Զѭ������
			new ServerThread(serverSocket.accept(), clientnum).start();
			// �������ͻ����󣬸��ݵõ���Socket����Ϳͻ��������������̣߳�������֮
			clientnum++; // ���ӿͻ�����
		}
		serverSocket.close(); // �ر�ServerSocket
	}
}
