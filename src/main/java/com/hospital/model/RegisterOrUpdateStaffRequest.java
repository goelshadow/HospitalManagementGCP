package com.hospital.model;

import java.io.Serializable;
import java.util.Date;

public class RegisterOrUpdateStaffRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	private Header header;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dob;
	private String activeStatus;
	private String gender;
	private String phone;
	private String email;
	private String profession;
	private String address;
	private String adminId;
	
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
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
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdateStaffRequest [header=" + header + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", dob=" + dob + ", activeStatus=" + activeStatus
				+ ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", profession=" + profession
				+ ", address=" + address + ", adminId=" + adminId + "]";
	}
}
