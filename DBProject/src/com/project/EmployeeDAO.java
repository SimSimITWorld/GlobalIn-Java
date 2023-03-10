package com.project;

/*
 *  DAO(Data Access Object)
 *  
 *  신규 사원등록
 *  getEmployeeregiste();
 *  사원 정보 조회(번호, 이름)
 *  getEmployeeCheck();
 *  사원 정보 조회(번호)
 *  getEmployeeNo();
 *  사원 정보 조회(이름)
 *  getEmployeeName();
 *  전체 사원 보기
 *  getEmployeetotal();
 */

import java.sql.*;
import java.util.*;

public class EmployeeDAO {

	// 새로운 사원 등록
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {

		// 사원 등록을 위한 sql문 작성
		String dml = "insert into employee(no, name, jobGrade, department, email) values(employee_seq.nextval, ?, ?, ?, ?)";

		Connection conn = null;

		PreparedStatement pstmt = null;

		EmployeeVO retval = null;

		try {
			conn = DBUtil.getConnection();

			pstmt = conn.prepareStatement(dml);

			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());

			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			retval.setStatus(i + "");

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}

		return retval;
	} // end getEmployeeregiste();

	// 사원의 번호, 이름을 입력받아 사원 정보를 조회하는 기능
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {

		String dml = "select * from employee where no=? and name=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			conn = DBUtil.getConnection();

			pstmt = conn.prepareStatement(dml);

			pstmt.setInt(1, no);
			pstmt.setString(2, name);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}
		return retval;
	} // end getEmployeeCheck();

	// 사원의 번호를 입력받아 사원 정보를 조회하는 기능
	public EmployeeVO getEmployeeNo(int no) throws Exception {

		String dml = "select * from employee where no=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			conn = DBUtil.getConnection();

			pstmt = conn.prepareStatement(dml);

			pstmt.setInt(1, no);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}
		return retval;
	} // end getEmployeeNo();

	// 사원의 이름을 입력받아 사원 정보를 조회하는 기능
	public EmployeeVO getEmployeeName(String name) throws Exception {

		String dml = "select * from employee where name=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {
			conn = DBUtil.getConnection();

			pstmt = conn.prepareStatement(dml);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException ss) {
			ss.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}
		return retval;
	} // end getEmployeeName();

	// 전체 사원 보기
	public ArrayList<EmployeeVO> getEmployeetotal() {

		ArrayList<EmployeeVO> list = new ArrayList<>();

		String dml = "select * from employee";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO emVO = null;

		try {

			conn = DBUtil.getConnection();

			pstmt = conn.prepareStatement(dml);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				emVO = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
				list.add(emVO);
			}

			

		} catch (SQLException ss) {
			ss.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}
		return list;
	}

	public ArrayList<String> getColumnName() {

		ArrayList<String> columnName = new ArrayList<>();

		String dml = "select * from employee";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;

		try {

			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(dml);
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for(int i = 1;i<=cols;i++) {
				columnName.add(rsmd.getColumnName(i));
			}
			
			
		} catch (SQLException ss) {
			ss.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException ee) {
				ee.printStackTrace();
			}

		}
		
		return columnName;
	}
}
