public class NewStudent implements Comparable {
	int english = 0;
	String name;

	NewStudent(int e, String n) {
		english = e;
		name = n;
	}

	public int compareTo(Object b) {
		NewStudent st = (NewStudent) b;
		return (this.english - st.english); // ���ɼ���С���ж���
	}
}
