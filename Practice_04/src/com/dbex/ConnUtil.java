package com.dbex;

import java.sql.*;

public class ConnUtil {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String password = "tiger";
		
		try {
			conn = DriverManager.getConnection(url, id, password);
		}catch(SQLException se) {
			se.printStackTrace();
		}
		
		return conn;
		
	}
	
}
