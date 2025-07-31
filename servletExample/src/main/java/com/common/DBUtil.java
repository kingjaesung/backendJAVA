package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 데이터베이스 드라이버와 Oracle 서버 연결 점검 프로그램 (javauser)와 연결

public class DBUtil {

	private static final String JDBC_URL =  "jdbc:oracle:thin:@127.0.0.1:1521/xepdb1";
	private static final String USER = "javauser";
	private static final String PASSWD = "java1234";
	
	static {
		try {
			Class.forName(JDBC_URL);
		}catch (ClassNotFoundException e) {
			throw new RuntimeException("Oracle 드라이버 로딩 실패",e);
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL,USER,PASSWD);
	}
	
}

