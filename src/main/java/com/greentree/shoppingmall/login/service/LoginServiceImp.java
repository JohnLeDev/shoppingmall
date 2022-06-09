package com.greentree.shoppingmall.login.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.greentree.shoppingmall.login.dto.LoginDto;
import com.greentree.shoppingmall.login.dto.SignUpDTO;
import com.greentree.shoppingmall.login.model.UserLogin;
import com.greentree.shoppingmall.login.reponsitory.LoginReponsitory;

@Service
public class LoginServiceImp implements LoginService {
	
	
	@Autowired
	private LoginReponsitory reponsitory;
	
	@Autowired
	private PasswordEncoder encoder;
	@Override
	public String login(LoginDto loginDTO) {
		// TODO Auto-generated method stub
		Optional<UserLogin> userOpt = reponsitory.findByUsername(loginDTO.getUsername() );
		
		return null;
	}


	@Override
	public String register(SignUpDTO signupDTO) {
		
		return null;
	}



	
}
