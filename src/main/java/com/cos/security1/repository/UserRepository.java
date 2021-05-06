package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

// CRUD 함수를 JpaRepository가 들고 있음
// @Repository 라는 어노테이션이 없어도 IoC가 됨.
public interface UserRepository extends JpaRepository<User, Integer> {
	// select * from user where username = 1?
	public User findByUsername(String username); // JPA Query methods
}
