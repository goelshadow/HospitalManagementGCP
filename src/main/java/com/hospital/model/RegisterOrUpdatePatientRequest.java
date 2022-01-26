package com.hospital.model;

import java.io.Serializable;

public class RegisterOrUpdatePatientRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	private Header header;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private String gender;
	private String phone;
	private String email;
	private String address;
	private String problem;
	private String patientId;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdatePatientRequest [header=" + header + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", problem=" + problem + ", patientId=" + patientId
				+ "]";
	}

}
