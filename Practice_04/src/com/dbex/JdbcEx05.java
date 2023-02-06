package com.dbex;

import java.sql.*;

public class JdbcEx05 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into professor_practice values(?,?,?,?,?,sysdate,?,?)";
		try {
			conn = ConnUtil.getConnection();

			
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(pstmt!=null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}

		}

	}

}
