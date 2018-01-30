package com.fram;

public class Sql {

	public static String selectCountry = "SELECT * FROM T_COUNTRY WHERE COUNTRY_NAME=?";

	public static String selectAllCountry = "SELECT * FROM T_COUNTRY";

	public static String selectGAME = "SELECT * FROM T_GAME WHERE GAME_NAME=?";

	public static String selectAllGAME = "SELECT * FROM T_GAME";

	public static String selectCountryGame11 = "SELECT * FROM T_COUNTRYGAME WHERE COUNTRY_NAME=?";

	public static String selectAllCountryGame = "SELECT * FROM T_COUNTRYGAME";

	public static String selectCountryGame = "SELECT *"
			+ " from T_COUNTRY country, T_GAME game, T_COUNTRYGAME countrygame "
			+ " WHERE country.COUNTRY_NAME = countrygame.COUNTRY_NAME " + " AND countrygame.GAME_NAME = game.GAME_NAME "
			+ " AND country.COUNTRY_NAME = ?";

}