package com.dbex;

import java.sql.*;

public class JdbcEx02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(url, id, password);

			stmt = conn.createStatement();

			String sql = "update department set dname='컴퓨터공학과' where deptno=203";

			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개의 행이 변경되었습니다.");

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}

			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
