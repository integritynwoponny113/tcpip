package com.game;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fram.DAO;
import com.fram.Sql;
import com.vo.GameVO;

public class GameDAO extends DAO<GameVO, String> {

	@Override
	public ArrayList<GameVO> selectAll(Connection conn) throws Exception {
		ArrayList<GameVO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(Sql.selectAllGAME);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				GameVO game = null;
				String getgame_name = rs.getString("GAME_NAME");
				String getstadium_location = rs.getString("STADIUM_LOCATION");
				String getfull_schedule = rs.getString("FULL_SCHEDULE");
				game = new GameVO(getgame_name, getstadium_location, getfull_schedule);
				list.add(game);

			}
		} catch (SQLException e) {
			throw e;
		} finally {
			close(rs);
			close(pstmt);
		}

		return list;
	}

	@Override
	public GameVO selectID(String k, Connection conn) throws Exception {

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		GameVO game = null;

		try {
			pstmt = conn.prepareStatement(Sql.selectGAME);
			pstmt.setString(1, k);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String getgame_name = rs.getString("GAME_NAME");
				String getstadium_location = rs.getString("STADIUM_LOCATION");
				String getfull_schedule = rs.getString("FULL_SCHEDULE");
				game = new GameVO(getgame_name, getstadium_location, getfull_schedule);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;

		} finally {
			close(rs);
			close(pstmt);
		}

		return game;
	}

	@Override
	public void insert(GameVO o, Connection conn) throws Exception {

	}

	@Override
	public void update(GameVO o, Connection conn) throws Exception {

	}

	@Override
	public void delete(String k, Connection conn) throws Exception {

	}
}
