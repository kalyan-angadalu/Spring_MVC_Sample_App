package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Column
private String FullName;
	@Column
private String Email;
	@Column
private String Password;
	@Column
private Long PhoneNumber;
	@Column
private String Gender;
	@Column
private String Country;
	@Column
private String Address;
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public Long getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Register() {
	super();
	// TODO Auto-generated constructor stub
}
public Register(Integer userId, String fullName, String email, String password, Long phoneNumber, String gender,
		String country, String address) {
	super();
	this.userId = userId;
	FullName = fullName;
	Email = email;
	Password = password;
	PhoneNumber = phoneNumber;
	Gender = gender;
	Country = country;
	Address = address;
}
@Override
public String toString() {
	return "Register [userId=" + userId + ", FullName=" + FullName + ", Email=" + Email + ", Password=" + Password
			+ ", PhoneNumber=" + PhoneNumber + ", Gender=" + Gender + ", Country=" + Country + ", Address=" + Address
			+ "]";
}



}
