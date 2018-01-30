package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;

public class UserDao extends Dao<UserVO,String>{
	// UserBiz���� ����ϴ� CRUD�Լ� ����
	// conection ������ UserBiz���� �޴´�.
	// SQL���� �ۼ��Ͽ� Oracle�� �ݿ���
	// ����� UserBiz�� �����Ѵ�

	public void insert(UserVO user, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt = conn.prepareStatement(Sql.insertUser);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getName());
			int result = pstmt.executeUpdate();
			System.out.println("Dao Insert ��� : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
	}

	public void delete(String str, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt = conn.prepareStatement(Sql.deleteUser);
			pstmt.setString(1, str);
			int result = pstmt.executeUpdate();
			System.out.println("Dao delete ��� : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
	}

	public void update(UserVO user, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt = conn.prepareStatement(Sql.updateUser);
			pstmt.setString(3, user.getId());
			pstmt.setString(1, user.getPwd());
			pstmt.setString(2, user.getName());

			int result = pstmt.executeUpdate();
			System.out.println("Dao update ��� : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
	}

	public UserVO select(String str, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		UserVO user = null;
		ResultSet rset = null;
		try {

			pstmt = conn.prepareStatement(Sql.selectUser);

			pstmt.setString(1, str);

			rset = pstmt.executeQuery();
			rset.next();
			String id = rset.getString("ID");
			String pwd = rset.getString("PWD");
			String name = rset.getString("NAME");

			user = new UserVO(id, pwd, name);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			if (pstmt != null)
				pstmt.close();
			if (rset != null)
				rset.close();
		}
		return user;
	}

	public ArrayList<UserVO> select(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ArrayList<UserVO> list=new ArrayList<>();
		ResultSet rset = null;
		try {

			pstmt = conn.prepareStatement(Sql.selectAllUser);
			rset = pstmt.executeQuery();
			while(rset.next()) {
			UserVO user = null;
			String id = rset.getString("ID");
			String pwd = rset.getString("PWD");
			String name = rset.getString("NAME");
			user = new UserVO(id, pwd, name);
			list.add(user);
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			if (pstmt != null)
				pstmt.close();
			if (rset != null)
				rset.close();
		}
		return list;
	}

}
