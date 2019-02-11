/**
 * 
 */
package com.example.SpringBootH2Demo;

/**
 * @author pradeep.a.nair
 *
 */
public class WelcomeRequest {

	/**
	 * @param name
	 * @param country
	 */
	public WelcomeRequest(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	String name;
	String country;

	public WelcomeRequest() {
		super();

	}

}
