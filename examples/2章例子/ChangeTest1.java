public class ChangeTest1 {
	public static void main(String args[]) {
		int i1 = 10;
		float f1 = 3.14f;
		double d1 = 3.1415926;
		// 注意大小写
		Integer I1 = new Integer(i1);// 生成integer类
		Float F1 = new Float(f1); // 生成float类
		Double D1 = new Double(d1); // 生成double类
		// 分别调用包装类的tostring()方法转换为字符串
		String si1 = I1.toString();// 注意大小写，toString在此不转
		String si2 = F1.toString();
		String si3 = D1.toString();
		System.out.println(si1);
		System.out.println(si2);
		System.out.println(si3);

	}
}
