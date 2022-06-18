package com.greentree.shoppingmall.welcome;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greentree.shoppingmall.common.util.ResponseHelper;

@RestController
public class Welcome {
	
	@GetMapping("/welcome")
	public Object welcome() {
		return ResponseHelper.getResponse("Welcome to the shopping mall", HttpStatus.OK) ;
	}
}
