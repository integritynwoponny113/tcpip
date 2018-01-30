package com.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class Biz<T,V> {
	protected Dao<T, V> dao;
	
	public Biz() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("oracle driver has not found....");
		}
	}
	
	
	public Connection getConnection() {

		// conection�� �������� �ʴ´�.
		// ���� �ٹ������� �����ϰ� �Ǹ� ������ ����;
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String password = "hr";
		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("db�� �����");
		}
		return conn;
	
	}
	public void close(Connection conn) {

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

			}
		}
	
	}
	public abstract void register(T t) throws Exception;
	public abstract void modify(T t) throws Exception;
	public abstract void remove(V v) throws Exception;
	public abstract T get(V v) throws Exception;	
	public abstract ArrayList<T> get() throws Exception;
	
	
}
