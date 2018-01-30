package mvc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Biz;

public class ProductBiz extends Biz<ProductVO, Integer>{

	@Override
	public void register(ProductVO t) throws Exception {
		Connection conn = getConnection();
		try {
			dao.insert(t, conn);

			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}
		
	}

	@Override
	public void modify(ProductVO t) throws Exception {
		Connection conn = getConnection();
		try {
			dao.update(t, conn);
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}

	}

	@Override
	public void remove(Integer v) throws Exception {
		Connection conn = getConnection();
		try {
			dao.delete(v, conn);
			conn.commit();
		} catch (SQLException e) {
			conn.rollback();
			throw e;
		} finally {

			close(conn);
		}

	}

	@Override
	public ProductVO get(Integer v) throws Exception {
		Connection conn = getConnection();
		ProductVO result = null;
		try {
			result = dao.select(v, conn);
		} catch (SQLException e) {
			throw e;
		} finally {

			close(conn);
		}
		return result;
	}

	@Override
	public ArrayList<ProductVO> get() throws Exception {
		Connection conn = getConnection();
		ArrayList<ProductVO> result = null;
		try {
			result = dao.select(conn);
			for(ProductVO x : result) {
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
