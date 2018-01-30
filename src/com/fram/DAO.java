package com.fram;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class DAO<O, K> {

	public void close(PreparedStatement pstmt) {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close(ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public abstract void insert(O o, Connection conn) throws Exception;

	public abstract void update(O o, Connection conn) throws Exception;

	public abstract void delete(K k, Connection conn) throws Exception;

	public abstract ArrayList<O> selectAll(Connection conn) throws Exception;

	public abstract O selectID(K k, Connection conn) throws Exception;

}
