package com.vo;

import java.util.ArrayList;

public class CountryVO {

	private String country_name;
	private int game_count;
	private int player_count;
	ArrayList<GameVO> gamevo;

	public CountryVO() {

	}

	public CountryVO(String country_name, int game_count, int player_count) {
		this.country_name = country_name;
		this.game_count = game_count;
		this.player_count = player_count;
	}

	public CountryVO(String country_name, int game_count, int player_count, ArrayList<GameVO> gamevo) {
		this.country_name = country_name;
		this.game_count = game_count;
		this.player_count = player_count;
		this.gamevo = gamevo;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public int getGame_count() {
		return game_count;
	}

	public void setGame_count(int game_count) {
		this.game_count = game_count;
	}

	public int getPlayer_count() {
		return player_count;
	}

	public void setPlayer_count(int player_count) {
		this.player_count = player_count;
	}

	public ArrayList<GameVO> getGamevo() {
		return gamevo;
	}

	public void setGamevo(ArrayList<GameVO> gamevo) {
		this.gamevo = gamevo;
	}

	@Override
	public String toString() {
		return "CountryVO [country_name=" + country_name + ", game_count=" + game_count + ", player_count="
				+ player_count + "]";
	}

}
