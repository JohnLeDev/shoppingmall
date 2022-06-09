package com.greentree.shoppingmall.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table
public class Account {
	@Id
	private UUID account;
	
	@Column
	private String active;
	
	@Column
	private String user_role;
	
	@Column
	private Date dob;
}
