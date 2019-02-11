/**
 * 
 */
package com.example.SpringBootH2Demo;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author pradeep.a.nair
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class WelcomeIntegrationTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testWelcomeService() throws Exception {
		WelcomeRequest request = new WelcomeRequest();
		request.setName("Pradeep");
		request.setCountry("India");
		ResponseEntity<WelcomeResponse> response = restTemplate.postForEntity("/welcome", request,
				WelcomeResponse.class);
		Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(response.getBody().getUserName()).isEqualTo("Pradeep");

	}

}
