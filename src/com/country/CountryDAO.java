package com.country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fram.DAO;
import com.fram.Sql;
import com.game.GameDAO;
import com.vo.CountryVO;
import com.vo.GameVO;

public class CountryDAO extends DAO<CountryVO, String> {

	public CountryVO setGame(CountryVO vo, Connection conn) throws Exception {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		GameVO gamevo = new GameVO();
		String gamename = null;
		try {
			pstmt = conn.prepareStatement(Sql.selectCountryGame);
			pstmt.setString(1, vo.getCountry_name());
			rset = pstmt.executeQuery();
			if (rset.next()) {
				gamename = rset.getString("GAME_NAME");
				gamevo.setGame_name(gamename);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			close(rset);
			close(pstmt);

		}

		return vo;

	}

	public ArrayList<GameVO> getgamevo(String c, Connection conn) throws Exception {

		ArrayList<GameVO> gamesvo = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
			pstmt = conn.prepareStatement(Sql.selectCountryGame);
			pstmt.setString(1, c);
			rset = pstmt.executeQuery();
			while (rset.next()) {
				GameVO gamevo = null;
				String getgame_name = rset.getString("GAME_NAME");
				String getstadium_location = rset.getString("STADIUM_LOCATION");
				String getfull_schedule = rset.getString("FULL_SCHEDULE");
				gamevo = new GameVO(getgame_name, getstadium_location, getfull_schedule);
				gamesvo.add(gamevo);
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close(rset);
			close(pstmt);
		}
		return gamesvo;
	}

	@Override
	public ArrayList<CountryVO> selectAll(Connection conn) throws Exception {

		ArrayList<CountryVO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(Sql.selectAllCountry);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				CountryVO country = null;
				String getcountry_name = rs.getString("COUNTRY_NAME");
				int getgame_count = rs.getInt("GAME_COUNT");
				int getplayer_count = rs.getInt("PLAYER_COUNT");
				country = new CountryVO(getcountry_name, getgame_count, getplayer_count);
				list.add(country);

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
	public CountryVO selectID(String k, Connection conn) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CountryVO country = null;

		try {
			pstmt = conn.prepareStatement(Sql.selectCountry);
			pstmt.setString(1, k);
			rs = pstmt.executeQuery();
			rs.next();
			String getcountry_name = rs.getString("COUNTRY_NAME");
			int getgame_count = rs.getInt("GAME_COUNT");
			int getplayer_count = rs.getInt("PLAYER_COUNT");
			country = new CountryVO(getcountry_name, getgame_count, getplayer_count);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;

		} finally {
			close(pstmt);
			close(rs);
		}

		return country;
	}

	@Override
	public void insert(CountryVO o, Connection conn) throws Exception {

	}

	@Override
	public void update(CountryVO o, Connection conn) throws Exception {

	}

	@Override
	public void delete(String k, Connection conn) throws Exception {

	}
}