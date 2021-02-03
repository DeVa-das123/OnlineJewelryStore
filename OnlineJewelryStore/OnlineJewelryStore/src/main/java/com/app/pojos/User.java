package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	/*
	 * • userId P.K • FName • LName • Email • Password • Address  
	 *  • Role
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid", length = 11)
	private Integer userId;
	@Column(name = "firstname", length = 20)
	private String fname;
	@Column(name = "lastname", length = 20)
	private String lname;
	@Column(name = "password", length = 40)
	private String password;	
	@Column(name = "email", length = 100, unique = true)
	private String email;
	@Column(name = "address", length = 100)
	private String address;
	/*
	 * @Enumerated(EnumType.STRING)
	 * 
	 * @Column(name = "role", length = 20) private Role userRole;
	 */
	@Column(name = "role", length = 20) 
	private String userRole;

	public User() {
		super();
	}

	public User(String fname, String lname, String password, String email,
			String address, String userRole) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;	
		this.email = email;
		this.address = address;
		this.userRole = userRole;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", password=" + password
				 + ", email=" + email + ", address=" + address
				+ ", userRole=" + userRole + "]";
	}

}
