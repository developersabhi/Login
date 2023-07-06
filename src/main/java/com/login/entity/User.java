package com.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User Registertion")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User ID")
	private int uId;
	@Column(name = "User Name", unique = true)
	private String username;
	@Column(name="First Name")
	private String fname;
	@Column(name="Last Name")
	private String lname;
	@Column(name = "User Email", unique = true)
	private String email;
	@Column(name="Password")
	private String password;
	@Column(name="Confirm Password")
	private String cpasword;
	@Column(name="gender")
	private String gender;
	@Column(name="isactive")
	private boolean isactive;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpasword() {
		return cpasword;
	}
	public void setCpasword(String cpasword) {
		this.cpasword = cpasword;
	}
	
	
	public User() {
	}
	public User(int uId, String username, String fname, String lname, String email, String password, String cpasword,
			String gender, boolean isactive) {
		this.uId = uId;
		this.username = username;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.cpasword = cpasword;
		this.gender = gender;
		this.isactive = isactive;
	}
	
	
	
	
	
	
	
}
