class RectA {
	double width, height, area;

	public double getArea() {
		area = height * width;
		return area;
	}
}

public class ep4_10 {
	public static void main(String args[]) {
		try {
			Class cs = Class.forName("RectA");
			RectA rect = (RectA) cs.newInstance();
			rect.width = 100;
			rect.height = 200;
			System.out.println("rectµÄÃæ»ý" + rect.getArea());
		} catch (Exception e) {
		}
	}
}