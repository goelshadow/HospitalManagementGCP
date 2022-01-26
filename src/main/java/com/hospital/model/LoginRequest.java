package com.hospital.model;

import java.io.Serializable;

public class LoginRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String phone;
	private String password;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [header=" + header + ", phone=" + phone + ", password=" + password + "]";
	}
}
