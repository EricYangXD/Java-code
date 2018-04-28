import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] args) {
		try {
			DBSource dbsource = new SimpleDBSource();
			Connection conn = dbsource.getConnection();
			if (!conn.isClosed()) {
				System.out.println("���ݿ������ѿ�����");
			}
			dbsource.closeConnection(conn);
			if (conn.isClosed()) {
				System.out.println("���ݿ������ѹرա�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}