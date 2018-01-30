package com.frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class Dao<T,V> {
	/*
	 * Insert Object to Oracle DB
	 * 
	 * **/
	
	
	//CRUD method define
	public void close(ResultSet rset) {

		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {

			}
		}
	
	}
	public void close(PreparedStatement pstmt) {

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {

			}
		}
	
	}
	
	public abstract void insert(T t, Connection conn) throws SQLException;
	public abstract void delete(V v, Connection conn) throws SQLException;
	public abstract void update(T t, Connection conn) throws SQLException;
	public abstract T select(V v, Connection conn) throws SQLException;
	public abstract ArrayList<T> select(Connection conn) throws SQLException;
}
