package com.dbex;

import java.io.*;
import java.sql.*;

public class JdbcEx09 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("sql 입력 : ");
		String sql = br.readLine();

		Connection conn = ConnUtil.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		// 쿼리 수행 결과 집합의 부가 정보를 가지고 있는 ResultSetMetaData 얻기
		ResultSetMetaData rsmd = rs.getMetaData();

		System.out.println("컬럼의 개수 : " + rsmd.getColumnCount());
		
		
		// 컬럼이름
		for(int i = 1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		
		
		
		
		int colCnt = rsmd.getColumnCount();
		
		while (rs.next()) {
			for (int colNum = 1; colNum <= colCnt; colNum++) {
				int colType = rsmd.getColumnType(colNum);
				
				switch(colType) {
				case Types.NUMERIC:		System.out.print(rs.getInt(colNum)+"\t"); break;
				case Types.VARCHAR:	System.out.print(rs.getString(colNum)+"\t"); break;
				case Types.DATE:			System.out.print(rs.getDate(colNum)+"\t"); break;
				}
			}
			System.out.println();
		
		}
		br.close();
		rs.close();
		pstmt.close();
		conn.close();

	}

}
