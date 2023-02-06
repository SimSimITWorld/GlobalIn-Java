package com.dbex;

// update : 

import java.sql.*;

public class JdbcEx02 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			// [2단계] jdbc 드라이버 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// [3단계]
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, id, password);
			// 위, 아래 동일 아무거나 사용

			// conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
			// "scott", "tiger");

			// System.out.println("데이터베이스 연결 성공 !!!!! ");

			// Statement 객체 생성(얻기)
			stmt = conn.createStatement();

			// 쿼리문 작성
			String sql = "update department set dname = '컴퓨터공학과' where deptno=203";

			// 쿼리문을 실행해서 결과를 저장
			int result = stmt.executeUpdate(sql);
			System.out.println(result + " 개의 행이 수정 되었습니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
		}

	}

}
