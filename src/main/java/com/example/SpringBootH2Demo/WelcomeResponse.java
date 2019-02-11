/**
 * 
 */
package com.example.SpringBootH2Demo;

/**
 * @author pradeep.a.nair
 *
 */
public class WelcomeResponse {
	
   /**
	 * @return the welcomeMessage
	 */
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	/**
	 * @param welcomeMessage the welcomeMessage to set
	 */
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
String welcomeMessage;
   String userName;

}
