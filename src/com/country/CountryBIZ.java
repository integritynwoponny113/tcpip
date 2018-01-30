package com.country;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fram.BIZ;
import com.game.GameDAO;
import com.vo.CountryVO;
import com.vo.GameVO;

public class CountryBIZ extends BIZ<CountryVO, String> {

	CountryDAO countrydao;
	GameDAO gamedao;

	public CountryBIZ() {
		countrydao = new CountryDAO();
		gamedao = new GameDAO();
	}

	@Override
	public ArrayList<CountryVO> getAll() throws Exception {

		Connection conn = getConnection();
		ArrayList<CountryVO> countrys = null;
		ArrayList<GameVO> games = null;
		try {
			countrys = countrydao.selectAll(conn);
			for (CountryVO c : countrys) {
				games = countrydao.getgamevo(c.getCountry_name(), conn);
				c.setGamevo(games);
			}
		} catch (SQLException e) {
			throw e;

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			close(conn);
		}
		return countrys;
	}

	@Override
	public CountryVO getID(String k) throws Exception {

		ArrayList<GameVO> games = null;
		Connection conn = getConnection();
		CountryVO country = null;

		try {
			country = countrydao.selectID(k, conn);
			games = countrydao.getgamevo(country.getCountry_name(), conn);
			country.setGamevo(games);

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;

		} finally {
			close(conn);
		}

		return country;
	}

	@Override
	public void register(CountryVO o) throws Exception {

	}

	@Override
	public void modify(CountryVO o) throws Exception {

	}

	@Override
	public void remove(String k) throws Exception {

	}
}
