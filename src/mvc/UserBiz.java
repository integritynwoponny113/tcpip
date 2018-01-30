package mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Biz;

public class UserBiz extends Biz<UserVO,String>{
	// main application(test) 에서 요천하는 기능 구현
	// Connection 생성하고 close 해야한다.
	//
	

	public UserBiz() {
		dao = new UserDao();
		driverLoader();
		
	}
	@Override
	public void register(UserVO user) throws Exception {
		Connection conn = getConnection();
		try {
			dao.insert(user, conn);

			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}

	}
	@Override
	public void remove(String str) throws Exception {
		Connection conn = getConnection();
		try {
			dao.delete(str, conn);
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}

	}
	@Override
	public void modify(UserVO user) throws Exception {
		Connection conn = getConnection();
		try {
			dao.update(user, conn);
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}

	}
	@Override
	public UserVO get(String str) throws Exception {
		Connection conn = getConnection();
		UserVO result = null;
		try {
			result = dao.select(str, conn);
		} catch (SQLException e) {
			throw e;
		} finally {

			close(conn);
		}
		return result;
	}
	@Override
	public ArrayList<UserVO> get() throws Exception {
		Connection conn = getConnection();
		ArrayList<UserVO> result = null;
		try {
			result = dao.select(conn);
			for(UserVO x : result) {
				System.out.println(x);
			}
			
		} catch (SQLException e) {

			throw e;
		} finally {

			close(conn);
		}
		return result;
	}

	
	

}
