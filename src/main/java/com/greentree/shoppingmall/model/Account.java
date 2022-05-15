package com.greentree.shoppingmall.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name="sm_account")
public class Account {
	
	@Column(name="username",unique=true,nullable=false,length=100)
	private String username;
	@Column(name="password",nullable = false)
	private String password;
	@Column(name="userrole" , nullable=false)
	@Enumerated(EnumType.STRING)
	private UserRole userRole;
	@Column(name="dob")
	private LocalDate dob;
	@Column(name="address");
	private String address;
	private String personalID;
	private String avatar;
}
