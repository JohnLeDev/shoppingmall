package com.greentree.shoppingmall.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greentree.shoppingmall.login.dto.LoginDto;

@RestController
public class LoginController {
	
		@GetMapping("/signup")
		public ResponseEntity<LoginDto> signup(){
			LoginDto dto = new LoginDto();
			return new ResponseEntity<LoginDto> (dto,HttpStatus.OK);
		}

	
}
