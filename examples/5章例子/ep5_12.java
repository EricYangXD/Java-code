public class ep5_12 {
	public static void main(String[] args) {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("notepad.exe c:\\count.txt");
			// 获得一个Runtime的实例对象并调用exec方法
			Thread.sleep(8000);
			p.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}