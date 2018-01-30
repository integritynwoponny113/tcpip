package com.game;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fram.BIZ;
import com.vo.GameVO;

public class GameBIZ extends BIZ<GameVO, String> {

	GameDAO dao = new GameDAO();

	@Override
	public ArrayList<GameVO> getAll() throws Exception {
		Connection conn = getConnection();
		ArrayList<GameVO> list = null;
		try {
			list = dao.selectAll(conn);
		} catch (SQLException e) {
			throw e;

		} finally {
			close(conn);
		}
		return list;
	}

	@Override
	public GameVO getID(String k) throws Exception {
		Connection conn = getConnection();
		GameVO game = null;

		try {
			game = dao.selectID(k, conn);
			System.out.println("조회성공");
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			close(conn);
		}

		return game;
	}

	@Override
	public void register(GameVO o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void modify(GameVO o) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub

	}
}