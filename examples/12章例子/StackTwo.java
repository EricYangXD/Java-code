import java.util.*;

class StackTwo {
	public static void main(String args[]) {
		Stack mystack = new Stack();
		mystack.push(new Integer(1));
		mystack.push(new Integer(1));
		int k = 1;
		while (k <= 10)
			for (int i = 1; i <= 2; i++) {
				Integer F1 = (Integer) mystack.pop();
				int f1 = F1.intValue();
				Integer F2 = (Integer) mystack.pop();
				int f2 = F2.intValue();
				Integer temp = new Integer(f1 + f2);
				System.out.println("" + temp.toString());
				mystack.push(temp);
				mystack.push(F2);
				k++;
			}
	}
}