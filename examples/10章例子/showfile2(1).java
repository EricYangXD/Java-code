import java.io.*;
import java.net.*;

class showfile2 {
	public static void main(String args[]) {
		InputStream filecon = null;
		DataInputStream filedata = null;
		String fileline;
		String url = "http://www.btbu.edu.cn/";
		URL fileur;
		try {
			fileur = new URL(url);
			filecon = fileur.openStream();
			filedata = new DataInputStream(filecon);
			while ((fileline = filedata.readLine()) != null) {
				System.out.println(fileline + "\n");
			}
		} catch (IOException e) {
			System.out.println("Error in I/O:" + e.getMessage());
		}
	}
}