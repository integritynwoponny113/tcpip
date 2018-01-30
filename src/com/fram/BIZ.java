package com.fram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BIZ<O, K> {

	protected DAO<O, K> DAO;

	public BIZ() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Oracle Driver Not Found ...");
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "ol";
		String password = "ol";

		try {
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false); // autoCommit false
		} catch (SQLException e) {
			System.out.println("Connection Exception ...");
			e.printStackTrace();
		}

		return conn;
	}

	public void close(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public abstract void register(O o) throws Exception;

	public abstract void modify(O o) throws Exception;

	public abstract void remove(K k) throws Exception;

	public abstract ArrayList<O> getAll() throws Exception;

	public abstract O getID(K k) throws Exception;

}
