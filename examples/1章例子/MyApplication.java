import java.util.*;

/*
 * ���������õ���Date��Properties�������࣬������Java.util������ġ�
 * ��System��Runtime�������࣬������Java.lang������ġ�
 */
public class MyApplication {
	public static void main(String[] args) {
		// �������������ӡ������
		System.out.println(new Date());
		// ���ϵͳ��Properties����p
		Properties p = System.getProperties();
		// ���������´�ӡ��p�еĸ���ϵͳ������ֵ
		p.list(System.out);
		/* ��ӡһ���ַ���---Memory Usage */
		System.out.println("--- Memory Usage:");
		// ���ϵͳ��Runtime����rt
		Runtime rt = Runtime.getRuntime();
		// ��ӡ���ڴ��С ��ӡ�����ڴ��С
		System.out.println("Total Memory= " + rt.totalMemory()
				+ " Free Memory = " + rt.freeMemory());
	}
}
