package com.example.demo.dao;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.pojo.user;

public interface UserDao  extends CrudRepository<user,Integer>{

	void save(User user);

}
