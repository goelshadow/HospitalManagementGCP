package com.hospital.model;

import java.io.Serializable;

public class RegisterOrUpdateDoctorRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Header header;
	private String password;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String gender;
	private String phone;
	private String email;
	private String profession;
	private String address;
	private String staffUserName;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStaffUserName() {
		return staffUserName;
	}
	public void setStaffUserName(String staffUserName) {
		this.staffUserName = staffUserName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdateDoctorRequest [header=" + header + ", password=" + password
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", profession=" + profession
				+ ", address=" + address + ", staffUserName=" + staffUserName + "]";
	}
}
