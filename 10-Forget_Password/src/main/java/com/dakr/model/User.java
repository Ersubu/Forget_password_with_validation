package com.dakr.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity
public class User {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	private String email;
	private String password;

	private String confPassword;
	
	
	public String getConfPassword() {
		return confPassword;
	}
	public void setConfPassword(String confPassword) {
		this.confPassword = confPassword;
	}
	private String token;
	@Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime tokenCreationDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LocalDateTime getTokenCreationDate() {
		return tokenCreationDate;
	}
	public void setTokenCreationDate(LocalDateTime tokenCreationDate) {
		this.tokenCreationDate = tokenCreationDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", confPassword="
				+ confPassword + ", token=" + token + ", tokenCreationDate=" + tokenCreationDate + "]";
	}
	
	

}
