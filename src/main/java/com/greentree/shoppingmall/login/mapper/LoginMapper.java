package com.greentree.shoppingmall.login.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.greentree.shoppingmall.login.dto.LoginDto;
import com.greentree.shoppingmall.login.model.UserLogin;



@Mapper
public interface LoginMapper {
	LoginMapper INSTANCE = Mappers.getMapper(LoginMapper.class);
	UserLogin toModel(LoginDto dto);
}
