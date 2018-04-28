import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class ep5_10 {
	private Properties propertie;
	private FileInputStream inputFile;
	private FileOutputStream outputFile;
	public ep5_10() {
		propertie = new Properties();
	}
	public ep5_10(String filePath) {
		propertie = new Properties();
		try {
			inputFile = new FileInputStream(filePath);
			propertie.load(inputFile);
			inputFile.close();
		} catch (FileNotFoundException ex) {
			System.out.println("�����ļ�·����������ļ�������");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("װ���ļ�--->ʧ��!");
			ex.printStackTrace();
		}
	}
	public String getValue(String key) {
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key);// �õ�ĳһ���Ե�ֵ
			return value;
		} else
			return "";
	}
	public void clear() {
		propertie.clear();
	}
	public void setValue(String key, String value) {
		propertie.setProperty(key, value);
	}
	public void saveFile(String fileName, String description) {
		try {
			outputFile = new FileOutputStream(fileName);
			propertie.store(outputFile, description);
			outputFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ep5_10 rc = new ep5_10("ep5_9.properties");// ���������ļ�
		String ip = rc.getValue("ip");// ��ȡproperties�ļ���ֵ
		String host = rc.getValue("host");
		String dbUserName = rc.getValue("dbUserName");
		String dbPassword = rc.getValue("dbPassword");		
		System.out.println("ip = " + ip);// ������������ļ��ж�����ֵ
		System.out.println("host = " + host);
		System.out.println("dbUserName = " + dbUserName);
		System.out.println("dbPassword = " + dbPassword);
		ep5_10 saveCf = new ep5_10();
		saveCf.setValue("min", "10"); // �������ļ�����дֵ
		saveCf.setValue("max", "1000");
		saveCf.saveFile("ep5_9.properties", "");
	}
}
