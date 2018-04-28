import java.util.*;

/*
 * 下面我们用到了Date和Properties这两个类，是属于Java.util这个包的。
 * 而System和Runtime这两个类，是属于Java.lang这个包的。
 */
public class MyApplication {
	public static void main(String[] args) {
		// 在命令行下面打印出日期
		System.out.println(new Date());
		// 获得系统的Properties对象p
		Properties p = System.getProperties();
		// 在命令行下打印出p中的各个系统变量的值
		p.list(System.out);
		/* 打印一行字符串---Memory Usage */
		System.out.println("--- Memory Usage:");
		// 获得系统的Runtime对象rt
		Runtime rt = Runtime.getRuntime();
		// 打印总内存大小 打印空闲内存大小
		System.out.println("Total Memory= " + rt.totalMemory()
				+ " Free Memory = " + rt.freeMemory());
	}
}
