package com.suhas.deviceAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeviceDataController {

	@GetMapping("/getDevice")
	public ResponseEntity<String> getInfo() {		
		return ResponseEntity.ok().body("Apple");
	}
}
