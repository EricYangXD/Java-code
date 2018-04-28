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
			System.out.println("属性文件路径错误或者文件不存在");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("装载文件--->失败!");
			ex.printStackTrace();
		}
	}
	public String getValue(String key) {
		if (propertie.containsKey(key)) {
			String value = propertie.getProperty(key);// 得到某一属性的值
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
		ep5_10 rc = new ep5_10("ep5_9.properties");// 加载配置文件
		String ip = rc.getValue("ip");// 读取properties文件的值
		String host = rc.getValue("host");
		String dbUserName = rc.getValue("dbUserName");
		String dbPassword = rc.getValue("dbPassword");		
		System.out.println("ip = " + ip);// 以下输出配置文件中读出的值
		System.out.println("host = " + host);
		System.out.println("dbUserName = " + dbUserName);
		System.out.println("dbPassword = " + dbPassword);
		ep5_10 saveCf = new ep5_10();
		saveCf.setValue("min", "10"); // 向配置文件中新写值
		saveCf.setValue("max", "1000");
		saveCf.saveFile("ep5_9.properties", "");
	}
}
