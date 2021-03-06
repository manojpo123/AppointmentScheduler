package com.appsch.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appsch.main.domain.Users;

@Repository
public interface UserDAO extends JpaRepository<Users, Long> {
	
	List<Users> findAll();

}
