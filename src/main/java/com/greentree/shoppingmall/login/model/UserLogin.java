package com.greentree.shoppingmall.login.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.greentree.shoppingmall.common.util.model.BaseModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity(name="shoppingmall_auth")
@Table(name = "shoppingmall_auth")
public class UserLogin extends BaseModel {
	private String username;
	private String password;
}
