import java.util.*;

class StackOne {
	public static void main(String args[]) {
		Stack mystack = new Stack();
		mystack.push(new Integer(1));
		mystack.push(new Integer(2));
		mystack.push(new Integer(3));
		mystack.push(new Integer(4));
		mystack.push(new Integer(5));
		mystack.push(new Integer(6));
		while (!(mystack.empty())) {
			Integer temp = (Integer) mystack.pop();
			System.out.print("   " + temp.toString());
		}
	}
}