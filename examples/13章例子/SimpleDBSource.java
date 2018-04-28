import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class SimpleDBSource implements DBSource {
	private Properties props;
	private String url;
	private String user;
	private String passwd;

	public SimpleDBSource() throws IOException, ClassNotFoundException {
		this("jdbc.properties");
	}

	public SimpleDBSource(String configFile) throws IOException,
			ClassNotFoundException {
		props = new Properties();
		props.load(new FileInputStream(configFile));
		url = props.getProperty("url");
		user = props.getProperty("user");
		passwd = props.getProperty("password");
		Class.forName(props.getProperty("driver"));
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, passwd);
	}

	public void closeConnection(Connection conn) throws SQLException {
		conn.close();
	}
}