package com.axis.finalproject.dto.employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class SignupDto {
	 private String name;
	 private String gender;
	 private int age;
	 private String designation;
	 private String address;
	 private String city;
	 private String state;
	 private String mobileNumber;
	 private String email;
	 private String password;
	 private String supervisor;
	 private String project;
	 private Set<String> roles;
	 private String image;
	


	public SignupDto(String name, String gender, int age, String designation, String address, String city, String state,
			String mobileNumber, String email, String password, String supervisor, String project, Set<String> roles) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.supervisor = supervisor;
		this.project = project;
		this.roles = roles;
	}

	public SignupDto(String name, String gender, int age, String designation, String address, String city, String state,
			String mobileNumber, String email, String password, String supervisor, String project) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.designation = designation;
		this.address = address;
		this.city = city;
		this.state = state;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.supervisor = supervisor;
		this.project = project;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public SignupDto() {
		super();
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	 
}
