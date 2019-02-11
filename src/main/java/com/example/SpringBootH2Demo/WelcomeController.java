package com.example.SpringBootH2Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	@PostMapping("/welcome")
	@ResponseBody
	public WelcomeResponse getWelcomeMessage(@RequestBody WelcomeRequest welcomeRequest) throws WelcomeDataException  {

		String welcomeMessage = welcomeService.getWelcomeMessage(welcomeRequest.getName(), welcomeRequest.getCountry());
		WelcomeResponse resp = new WelcomeResponse();
		resp.setWelcomeMessage(welcomeMessage);
		// resp.setWelcomeMessage("Welcome "+welcomeRequest.getName()+" to
		// "+welcomeRequest.getCountry());
		resp.setUserName(welcomeRequest.getName());
		return resp;

	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleDataException(WelcomeDataException e) {
	}

	{

	}

}
