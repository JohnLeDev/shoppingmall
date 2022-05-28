package com.greentree.shoppingmall.login.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.greentree.shoppingmall.model.Account;


public interface UserService {
	List<Account> getAllUser();
	Account getUserName(String username);
	boolean removeUsser(UUID id) ;
	
}
