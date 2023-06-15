package com.splitwise.user;

public class User {
	private int id;
	private String name;
	private String email;
	private String password;
	private String contact_number;
	
	public User(int id, String name, String email, String password, String contact_number ) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.contact_number = contact_number;
	}
	
	public User(String name, String email, String password, String contact_number) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact_number = contact_number;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getContact_number() {
		return contact_number;
	}
	public String getEmail() {
		return email;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
}
