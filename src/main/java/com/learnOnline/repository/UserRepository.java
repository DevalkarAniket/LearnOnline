package com.learnOnline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnOnline.entity.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	boolean existsByEmail(String email);

	boolean existsByPhno(String phno);

	Users getByEmail(String email);

	Users getByPhno(String phno);
}
