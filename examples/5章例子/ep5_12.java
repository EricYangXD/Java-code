public class ep5_12 {
	public static void main(String[] args) {
		Process p = null;
		try {
			p = Runtime.getRuntime().exec("notepad.exe c:\\count.txt");
			// ���һ��Runtime��ʵ�����󲢵���exec����
			Thread.sleep(8000);
			p.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}