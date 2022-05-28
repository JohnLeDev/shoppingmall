package com.greentree.shoppingmall.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping
	public ResponseEntity<String> getAllUser(){
		return new  ResponseEntity<String>("hello",HttpStatus.OK);
	}
}
