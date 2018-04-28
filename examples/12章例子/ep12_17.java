import java.util.*;

class ep12_17 {
	public static void main(String args[]) {
		Vector vector = new Vector();
		Date date = new Date();
		vector.add(new Integer(1));
		vector.add(new Float(3.45f));
		vector.add(new Double(7.75));
		vector.add(new Boolean(true));
		vector.add(date);
		System.out.println(vector.size());
		Integer number1 = (Integer) vector.get(0);
		System.out.println("向量的第1个元素： " + number1.intValue());
		Float number2 = (Float) vector.get(1);
		System.out.println("向量的第2个元素： " + number2.floatValue());
		Double number3 = (Double) vector.get(2);
		System.out.println("向量的第3个元素： " + number3.doubleValue());
		Boolean number4 = (Boolean) vector.get(3);
		System.out.println("向量的第4个元素： " + number4.booleanValue());
		date = (Date) vector.lastElement();
		System.out.println("向量的第5个元素： " + date.toString());
		if (vector.contains(date))
			System.out.println("ok");
	}
}
