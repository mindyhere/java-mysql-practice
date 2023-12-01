package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection dbConn() {
//		   static → DB.dbConn(); 바로 호출가능
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("c://work/db.prop");
			Properties prop = new Properties();
			prop.load(fis);
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			conn = DriverManager.getConnection(url, id, password);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return conn;
	}
}
