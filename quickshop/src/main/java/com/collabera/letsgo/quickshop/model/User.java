package com.collabera.letsgo.quickshop.model;

public class User {
	private long id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private String username;
	private String password;
	private UserRole role;
	
	public User() {
		super();
	}
	public User(String first_name, String last_name, String email, String phone_number, String username,
			String password, UserRole role) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + first_name + " " + last_name + ", email=" + email
				+ ", phone_number=" + phone_number + ", username=" + username + ", password=" + password + ", role="
				+ role + "]";
	}
	
	
}
