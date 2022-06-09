package com.greentree.shoppingmall.login.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.greentree.shoppingmall.login.dto.LoginDto;
import com.greentree.shoppingmall.login.dto.SignUpDTO;
import com.greentree.shoppingmall.model.Account;


public interface LoginService {
	String login( LoginDto loginDTO);
	String register(  SignUpDTO signupDTO);
}
