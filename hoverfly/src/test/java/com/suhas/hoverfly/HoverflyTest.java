package com.suhas.hoverfly;

import static org.junit.Assert.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import io.specto.hoverfly.junit5.HoverflyExtension;
import io.specto.hoverfly.junit5.api.HoverflySimulate;


@ExtendWith(HoverflyExtension.class)
@HoverflySimulate(source = 
@HoverflySimulate.Source(value = "simulation.json", 
						type = HoverflySimulate.SourceType.DEFAULT_PATH),
						enableAutoCapture = true)
public class HoverflyTest {

	@Test
	public void test() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	     
		final String baseUrl = "http://localhost:" + 8900 + "/getDevice";
		URI uri = new URI(baseUrl);
		 
		ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

		assertEquals(200, response.getStatusCodeValue());
		assertEquals("Apple", response.getBody());
	}
	
}
