import java.io.*;
class ExceptionDemo1 {
	public static void main(String args[]){
		FileInputStream fis = new FileInputStream("test.txt");
		int b;
		while ((b = fis.read()) != -1) {
			System.out.print(b);
		}
		fis.close();
	}
}