package com.dbex;

import java.sql.*;
import java.io.*;
import java.util.*;

public class JdbcEx10 {

	public static void main(String[] args) throws IOException, SQLException {
		
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department_practice.properties"));
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnUtil.getConnection();
			pstmt = conn.prepareStatement(pro.getProperty("department_practice_insert"));
			
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 행이 추가 되었습니다.");
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
		

	}

}
