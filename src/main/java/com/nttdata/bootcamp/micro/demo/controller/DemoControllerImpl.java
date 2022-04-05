package com.nttdata.bootcamp.micro.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerImpl implements DemoControllerI {
	
	@GetMapping("/demo/holamundo")
	
	public ResponseEntity<String> saludo(){
		
		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola Mundo");
		
		
	}

}
