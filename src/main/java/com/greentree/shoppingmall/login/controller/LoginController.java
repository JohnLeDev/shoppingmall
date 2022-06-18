package com.greentree.shoppingmall.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greentree.shoppingmall.login.dto.LoginDto;
import com.greentree.shoppingmall.login.dto.SignUpDTO;
import com.greentree.shoppingmall.login.mapper.SignupMapper;
import com.greentree.shoppingmall.login.service.LoginService;

@RestController
public class LoginController {
		@Autowired
		LoginService loginService;
		
		@GetMapping("/signup")
		public ResponseEntity<SignUpDTO> signup(@RequestBody SignUpDTO dto){
			
			String response =  loginService.register(dto);
			if (response == null) {
				 new ResponseEntity<SignUpDTO> (dto,HttpStatus.BAD_REQUEST);
			}
			return new ResponseEntity<SignUpDTO> (dto,HttpStatus.OK);
		}
		
		@GetMapping("/login")
		public ResponseEntity<LoginDto> login(){
			LoginDto login = new LoginDto();
			login.setUsername("welecome");
			return new ResponseEntity<LoginDto>(login,HttpStatus.OK) ;
		}
	
}
