package com.dbex;

import java.sql.*;

public class JdbcEx04 {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";
			
			conn = DriverManager.getConnection(url, id, password);
			
			stmt = conn.createStatement();
			
			String sql = "select deptno, dname, college, loc from department";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
			}
			
			
			
		}catch(Exception e) {
			
		}

	}

}
