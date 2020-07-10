package com.bunny.spring.scheduler.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bunny.spring.scheduler.api.model.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
