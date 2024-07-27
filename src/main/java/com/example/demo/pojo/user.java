package com.example.demo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tblSpring_user")
public class user {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String Firstname;
	private String Surname;
	private String email;
	
	public user () {}

	public user(Integer id, String firstname, String surname, String email) {
		super();
		this.id = id;
		Firstname = firstname;
		Surname = surname;
		this.email = email;
	}

	public user(String firstname, String surname, String email)
	{
		super();
		Firstname = firstname;
		Surname = surname;;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	
    
	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		this.Surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
