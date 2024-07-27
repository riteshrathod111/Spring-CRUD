package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.user;

@RestController
public class usercontroller {

	@Autowired
	private UserDao userdao;
	
	
	@GetMapping("user/call")
	public List<user> getAllUser()
	{
		return (List<user>) userdao.findAll();
	}
	
	@PostMapping("user/save")
	public void saveuser(@RequestBody user user)
	{
		userdao.save(user);
	}
	
	
	@GetMapping("user/{id}")
	public Optional<user> getUserById(@PathVariable Integer id)
	{
		return userdao.findById(id);
	}
	
	@PutMapping("user/update")
	public void UpdateUser(@RequestBody user user)
	{
		userdao.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteuser(@PathVariable Integer id)
	{
		userdao.deleteById(id);
	}
	
	
	
}
