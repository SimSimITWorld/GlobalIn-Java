package com.dbex;

import java.sql.*;

public class JdbcEx08 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		/* 
		 *  transaction : 논리적인 작업단위
		 *    - insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로
		 *      묶어서 쿼리 실행시 모든 작업이 정상적으로 처리된 경우에는 commit을 실행해서 DB에 반영하고,
		 *      쿼리 실행 중 하나라도 정상처리가 되지 않을 경우 rollback을 실행해서 작업단위 내의 모든 작업을 취소함.
		 */
		
		String sql1 = "insert into department values(?, ?, ?, ?)";
		
		String sql2 = "update department set dname = ?, loc = ? where deptno=?";
		
		
		
		try {
			///////////////////// 논리적인 작업단위 시작//////////////////////
			// 하나의 논리적인 작업 단위 시작
			conn = ConnUtil.getConnection();
			
			// autoCommit 기능을 비활성화
			conn.setAutoCommit(false);
			
			//------------------추가작업(첫번째 작업) 시작------------------//
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			
			//------------------추가작업(첫번째 작업) 종료------------------//
			//------------------추가작업(두번째 작업) 시작------------------//
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			//------------------추가작업(두번째 작업) 종료------------------//
			
			
			// 쿼리가 정상적으로 실행된 경우 db에 반영함
			conn.commit();
			System.out.println("db에 정상적으로 반영되었습니다.");
			
		}catch(SQLException e) {
			try {
			conn.rollback();
			System.out.println("db에 비정상적인 작업으로 인해 취소 되었습니다.");
			} catch(SQLException se) {
				se.printStackTrace();
			}
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
					pstmt.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			///////////////////// 논리적인 작업단위 종료//////////////////////
		}
		

	}

}
