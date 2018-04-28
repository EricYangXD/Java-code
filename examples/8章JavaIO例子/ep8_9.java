import java.io.*;
import java.util.*;

//该类提供了对向量的包装，返回根据文件名打开的FileInputStream.
class InputStreamEnumerator implements Enumeration {
	private Enumeration files;

	public InputStreamEnumerator(Vector files) {
		this.files = files.elements();
	}

	public boolean hasMoreElements() {
		return files.hasMoreElements();
	}

	public FileInputStream nextElement() {
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (IOException e) {
			return null;
		}
	}
}

class ep8_9 {
	public static void main(String args[]) throws IOException {
		int c;
		Vector files = new Vector();
		files.addElement("c:/java/1.txt");
		files.addElement("c:/java/2.txt");
		InputStreamEnumerator e = new InputStreamEnumerator(files);
		InputStream input = new SequenceInputStream(e);
		while ((c = input.read()) != -1) {
			System.out.print((char) c);
		}
		input.close();
	}
}