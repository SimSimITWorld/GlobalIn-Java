package com.dbex;

import java.sql.*;

public class JdbcEx07 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select a.name, a.profno, a.position, b.dname from professor a, department b "
		               +"where a.deptno=b.deptno and a.deptno=? ";
		
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 203);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String s1 = rs.getString("name");
				int i = rs.getInt("profno");
				String s2 = rs.getString("dname");
				String s3 = rs.getString("position");
				
				System.out.println(s1+"\t"+i+"\t"+s3+"\t"+s2);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
		}
		

	}

}
