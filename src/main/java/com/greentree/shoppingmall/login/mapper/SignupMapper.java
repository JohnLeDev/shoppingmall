package com.greentree.shoppingmall.login.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.greentree.shoppingmall.login.dto.SignUpDTO;
import com.greentree.shoppingmall.login.model.UserLogin;

@Mapper
public interface SignupMapper {
	SignupMapper INSTANCE =  Mappers.getMapper(SignupMapper.class); 
	UserLogin toModel(SignUpDTO dto);
}
