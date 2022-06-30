package application;

public class Game {

	public String gameTitle;
	public int gameScore;
	public String gamePlayed;
	
	public Game(String gameTitle, int gameScore, String gamePlayed) {
		super();
		this.gameTitle = gameTitle;
		this.gameScore = gameScore;
		this.gamePlayed = gamePlayed;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public int getGameScore() {
		return gameScore;
	}

	public void setGameScore(int gameScore) {
		this.gameScore = gameScore;
	}

	public String getGamePlayed() {
		return gamePlayed;
	}

	public void setGamePlayed(String gamePlayed) {
		this.gamePlayed = gamePlayed;
	}
	
}
