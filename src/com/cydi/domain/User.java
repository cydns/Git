package com.cydi.domain;

import java.util.Date;

public class User {
	
	private Integer id;
	private String username;
	private Date birthday;
	private String address;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, Date birthday, String address) {
		super();
		this.username = username;
		this.birthday = birthday;
		this.address = address;
	}
	
	
	public User(Integer id, String username, Date birthday, String address) {
		super();
		this.id = id;
		this.username = username;
		this.birthday = birthday;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", address=" + address + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
