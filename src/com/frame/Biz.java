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

		// conection은 공유하지 않는다.
		// 동시 다발적으로 공유하게 되면 에러가 난다;
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String password = "hr";
		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("db가 없어요");
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
