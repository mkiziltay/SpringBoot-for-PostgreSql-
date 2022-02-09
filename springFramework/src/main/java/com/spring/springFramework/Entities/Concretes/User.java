package com.spring.springFramework.Entities.Concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="created_date")
	private LocalDate createdDate=LocalDate.now();

	@Column(name="email")
	private String email;

	@Column(name="password")
	private String password;
	
	
// Default Contructor
	public User() {
		super();
	}

	public User(int id, LocalDate createdDate, String email, String password) {
		super();
		this.id = id;
		this.createdDate = createdDate;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
