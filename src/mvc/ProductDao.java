package mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import frame.Dao;

public class ProductDao extends Dao<ProductVO, Integer> {

	@Override
	public void insert(ProductVO t, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt= conn.prepareStatement(Sql.insertProduct);
			pstmt.setInt(1, t.getId());
			pstmt.setString(2, t.getName());
			pstmt.setDouble(3, t.getPrice());
			int result = pstmt.executeUpdate();
			System.out.println("Dao Insert 결과 : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
		
		
	}

	@Override
	public void delete(Integer v, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt= conn.prepareStatement(Sql.deleteProduct);
			pstmt.setInt(1, v);
			int result = pstmt.executeUpdate();
			System.out.println("Dao delete 결과 : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
		
	}

	@Override
	public void update(ProductVO t, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		try {

			pstmt= conn.prepareStatement(Sql.updateProduct);
			pstmt.setInt(3, t.getId());
			pstmt.setString(1, t.getName());
			pstmt.setDouble(2,  t.getPrice());
			int result = pstmt.executeUpdate();
			System.out.println("Dao update 결과 : " + result);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
		
	}

	@Override
	public ProductVO select(Integer v, Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ProductVO product = null;
		ResultSet rset = null;
		try {

			pstmt= conn.prepareStatement(Sql.selectProduct);
			pstmt.setInt(1, v);
			rset = pstmt.executeQuery();
			rset.next();
			int id = rset.getInt("ID");
			String name = rset.getString("NAME");
			double price = rset.getDouble("PRICE");
			product = new ProductVO(id, name, price);

		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
		
		
		return product;
	}

	@Override
	public ArrayList<ProductVO> select(Connection conn) throws SQLException {
		PreparedStatement pstmt = null;
		ProductVO product = null;
		ArrayList<ProductVO> list = new ArrayList<>();
		ResultSet rset = null;
		try {

			pstmt= conn.prepareStatement(Sql.selectAllProduct);
			rset = pstmt.executeQuery();
			while(rset.next()) {
			int id = rset.getInt("ID");
			String name = rset.getString("NAME");
			double price = rset.getDouble("PRICE");
			product = new ProductVO(id, name, price);
			list.add(product);
			}
		} catch (SQLException e) {
			throw e;
		} finally {
			System.out.println("Dao Finally");

			pstmt.close();
		}
		
		
		return list;
	}



}
