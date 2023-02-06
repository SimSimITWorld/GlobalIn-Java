package com.dbex;

import java.sql.*;

public class JdbcEx06 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "update professor set sal=? where name =?";

		try {
			conn = ConnUtil.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			
			int i = pstmt.executeUpdate();
			System.out.println(i+ "개의 행이 수정되었습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(pstmt != null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
	}

}
