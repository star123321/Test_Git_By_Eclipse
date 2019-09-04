package nuc.ss.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Wz_ConnUtil {

	public static final String DBDRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql:///staffmanager";
	public static final String DBUSER = "root";
	public static final String DBPASS = "123456";
	
	public static Connection conn;
	
	public static Connection getConn() {
		
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
}
