package com.example.SpringBootH2Demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {

	@Autowired
	private MockMvc mvc;

	@MockBean
	private WelcomeService welcomeService1;

	@Test
	public void getWelcomeMessage_shouldReturnMessage() throws Exception {

		BDDMockito.given(welcomeService1.getWelcomeMessage(BDDMockito.anyString(), BDDMockito.anyString()))
				.willReturn("Welcome Pradeep to India");
		mvc.perform(MockMvcRequestBuilders.post("/welcome").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(new WelcomeRequest("Pradeep", "India"))))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("userName").value("Pradeep"));
	}
	
	@Test
	public void getWelcomeMessage_shouldReturnDataErrorMessage() throws Exception {

		BDDMockito.given(welcomeService1.getWelcomeMessage(BDDMockito.isNull(), BDDMockito.isNull()))
				.willThrow(new WelcomeDataException());
		mvc.perform(MockMvcRequestBuilders.post("/welcome").contentType(MediaType.APPLICATION_JSON)
				.content(new ObjectMapper().writeValueAsString(new WelcomeRequest())))
				.andExpect(MockMvcResultMatchers.status().isNotFound());
				
	}

}
