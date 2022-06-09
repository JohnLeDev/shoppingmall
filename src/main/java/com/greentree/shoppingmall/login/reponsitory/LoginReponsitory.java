package com.greentree.shoppingmall.login.reponsitory;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greentree.shoppingmall.login.model.UserLogin;

@Repository
public interface LoginReponsitory extends JpaRepository<UserLogin, UUID> {

	@Query("SELECT u FROM shoppingmall_auth u WHERE u.username = ?1")
	Optional<UserLogin> findByUsername(String username);
}
