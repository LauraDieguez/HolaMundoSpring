package com.nttdata.bootcamp.micro.demo.controller;

import org.springframework.http.ResponseEntity;

//Aqui solo van las clases
public interface DemoControllerI {
	ResponseEntity<String> saludo();
}
