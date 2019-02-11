package com.example.SpringBootH2Demo;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getWelcomeMessage(String name, String country) throws WelcomeDataException
	{
		if(null != name && null != country)
		{
			return "Welcome "+name+" to "+country;
		}
		else
			
		{
			throw new WelcomeDataException();
		}
	}

}
