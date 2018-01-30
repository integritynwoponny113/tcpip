package com.vo;

public class GameVO {

	private String game_name;
	private String stadium_location;
	private String full_schedule;

	public GameVO() {
	}

	public GameVO(String game_name, String stadium_location, String full_schedule) {
		this.game_name = game_name;
		this.stadium_location = stadium_location;
		this.full_schedule = full_schedule;
	}

	public String getGame_name() {
		return game_name;
	}

	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}

	public String getStadium_location() {
		return stadium_location;
	}

	public void setStadium_location(String stadium_location) {
		this.stadium_location = stadium_location;
	}

	public String getFull_schedule() {
		return full_schedule;
	}

	public void setFull_schedule(String full_schedule) {
		this.full_schedule = full_schedule;
	}

	@Override
	public String toString() {
		return "GameVO [game_name=" + game_name + ", stadium_location=" + stadium_location + ", full_schedule="
				+ full_schedule + "]";
	}

}
