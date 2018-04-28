//Create a superclass.
class SA {
	int i, j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

// Create a subclass by extending class A.
class SB extends A {
	int k;

	void showk() {
		System.out.println("k: " + k);
	}

	void sum() {
		System.out.println("i+j+k: " + (i + j + k));
	}
}

class SimpleInheritance {
	public static void main(String args[]) {
		SA superOb = new SA();
		SB subOb = new SB();
		// The superclass may be used by itself.
		superOb.i = 10;
		superOb.j = 20;
		System.out.println("Contents of superOb: ");
		superOb.showij();
		System.out.println();
		// The subclass has Access to all public members of its superclass.
		subOb.i = 7;
		subOb.j = 8;
		subOb.k = 9;
		System.out.println("Contents of subOb: ");
		subOb.showij();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i, j and k in subOb:");
		subOb.sum();
	}
}
