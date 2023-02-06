package com.dbex;

/*
 *  [1단계]
 *           import java.sql.*;
 * 
 *  [2단계]
 *           특정 드라이버 검색
 *           oracle : thin Driver 사용
 *                      oracle.jdbc.driver.OracleDriver
 *           Class.forName("oracle.jdbc.driver.OracleDriver");
 *           
 *   [3단계]
 *           Connection conn = DriverManager.getConnection(url, id, password);
 *           * url			: jdbc:oracle:thin:@localhost:1521:orcl
 *           * id				: scott
 *           * password	: tiger
 *           
 *   [4단계]
 *           Query문 작성
 *                   - 정적
 *                   			Statement Class(정적) : sql 쿼리문을 데이터베이스로 전송하고 실행결과를 반환한다.
 *                   			Statement stmt = conn.createStatement();
 *                   - 동적
 * 								PreparedStatement Class(동적)
 * 								PreparedStatement pstmt = conn.prepareStatement(query);
 * 
 *   [5단계]
 *           결과 저장
 *                  (정적)
 *                   - ResultSet rs = stmt.executeQuery(query);    	// select
 *                   - ResultSet rs = stmt.executeUpdate(query);  	// insert, update, delete
 *                   
 *                  (동적)
 *                   - ResultSet rs = pstmt.executeQuery(query);     // select
 *                   - ResultSet rs = pstmt.executeUpdate(query);	 // insert, update, delete
 *                   
 *   [6단계]
 *           사용 후 반드시 close() 한다.
 */
// [1단계]
import java.sql.*;

public class JdbcEx01 {

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
			
			// conn = ConnUtil.getConnection();
			// 위, 아래 동일 아무거나 사용

			// conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
			// "scott", "tiger");

			// System.out.println("데이터베이스 연결 성공 !!!!! ");

			// Statement 객체 생성(얻기)
			stmt = conn.createStatement();

			// 쿼리문 작성
			String sql = "insert into department values(203, '제어계측공학과', 200, '7호관')";

			// 쿼리문을 실행해서 결과를 저장
			int result = stmt.executeUpdate(sql);
			System.out.println(result + " 개의 행이 추가 되었습니다.");

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
