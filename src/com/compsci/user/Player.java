package com.compsci.user;

public class Player extends ClientUser {

	private static final long serialVersionUID = -5453952520070522951L;
	
	public Player(String userName) {
		super(EnumAuthorityLevel.PLAYER, userName);
	}
	
	protected Player(EnumAuthorityLevel level, String userName, String password) {
		super(level, userName);
	}
	
//	public static Player initPlayer() {
//		return new Player("Spongeboob");
//		
//		Tell client to show the login screen. (Where they can say their a new user, or enter a username and password.
//		if not a new user and account is good, then let them enter.
		
//		depending on what their file says create a new version of that user.
//		if file says moderator:
//		return new Moderator()
//		ie
		
//		String name = ChatManager.prompt("What is your userName?");
		
//		for now it returns a new moderator
//		return new Moderator(name, "Spongeboob");
//	}
}
