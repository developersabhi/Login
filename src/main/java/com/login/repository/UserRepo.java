package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}
