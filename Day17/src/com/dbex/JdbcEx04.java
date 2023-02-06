package com.dbex;

import java.sql.*;

public class JdbcEx04 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		/*
		 *  select 문으로 실행한 결과를 저장한 집합체
		 *  데이터를 추출할 수 있는 메소드를 가지고 있는 객체가 ResultSet
		 */
		

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
			String sql = "select deptno, dname, college, loc from department";
			
			rs = stmt.executeQuery(sql);
			
			/*
			 *  rs 객체로부터 데이터를 추출
			 *  
			 *  rs 객체에서 제공하는 메소드를 이용함
			 *  rs 의 next() 메소드는 커서를 다음 행으로 이동시킴
			 *  이동된 위치에 행이 존재하면 true, 존재하지 않으면 false를 반환함
			 *  
			 *  rs.next() 이 값이 참인동안 rs로부터 데이터를 추출함
			 */
			
			while(rs.next()) {
				// 커서가 위치한 행(로우)의 각각의 열(컬럼)에서 값을 추출함
				// getXXX(컬럼의 위치), getXXX(컬럼의 이름)을 사용해서 열 값을 추출함
				int i = rs.getInt(1); // int i = rs.getInt("deptno");
				String s1 = rs.getString(2); //  String s1 = rs.getString("dname");
				int j = rs.getInt("college"); // rs.getInt("college");
				String s2 = rs.getString("loc"); // rs.getString("loc");
				System.out.print(i+"\t"+s1+"\t"+j+"\t"+s2);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception se) {
			se.printStackTrace();
		} finally {
			
			try {
				if (rs != null)
					conn.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			
			
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
