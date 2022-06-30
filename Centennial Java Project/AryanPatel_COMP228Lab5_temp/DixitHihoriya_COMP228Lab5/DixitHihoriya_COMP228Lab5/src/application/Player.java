package application;

class Player {
	public int playerId;
	public String playerFirstName;
	public String playerLastName;
	public String playerAddress;
	public String playerProvince;
	public String playerPostalCode;
	public String playerPhoneNumber;

	public Player(int playerId, String playerFirstName, String playerLastName, String playerAddress,
			String playerProvince, String playerPostalCode, String playerPhoneNumber) {
		super();
		this.playerId = playerId;
		this.playerFirstName = playerFirstName;
		this.playerLastName = playerLastName;
		this.playerAddress = playerAddress;
		this.playerProvince = playerProvince;
		this.playerPostalCode = playerPostalCode;
		this.playerPhoneNumber = playerPhoneNumber;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerLastName() {
		return playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}

	public String getPlayerAddress() {
		return playerAddress;
	}

	public void setPlayerAddress(String playerAddress) {
		this.playerAddress = playerAddress;
	}

	public String getPlayerProvince() {
		return playerProvince;
	}

	public void setPlayerProvince(String playerProvince) {
		this.playerProvince = playerProvince;
	}

	public String getPlayerPostalCode() {
		return playerPostalCode;
	}

	public void setPlayerPostalCode(String playerPostalCode) {
		this.playerPostalCode = playerPostalCode;
	}

	public String getPlayerPhoneNumber() {
		return playerPhoneNumber;
	}

	public void setPlayerPhoneNumber(String playerPhoneNumber) {
		this.playerPhoneNumber = playerPhoneNumber;
	}

}