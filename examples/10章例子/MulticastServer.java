public class MulticastServer {
	public static void main(String args[]) throws java.io.IOException {
		new MulticastServerThread().start();
		// 启动一个服务器线程
	}
}