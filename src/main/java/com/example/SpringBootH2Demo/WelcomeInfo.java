package com.example.SpringBootH2Demo;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@javax.persistence.Entity
public class WelcomeInfo {
	
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
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
	String country;
	String welcomeMessage;

}
