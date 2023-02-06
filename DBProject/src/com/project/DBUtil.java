package com.project;

import java.sql.*;

public class DBUtil {

	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	static final String id = "scott";
	static final String password = "tiger";

	public static Connection getConnection() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection(url, id, password);

		return conn;

	}

}
