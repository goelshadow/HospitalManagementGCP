package com.hospital.model;

import java.io.Serializable;

public class RegisterOrUpdateHospitalDetails implements Serializable {

	private Header header;
	private String hospitalName;
	private String speciality;
	private String phoneNumber;
	private String email;
	private String address;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	@Override
	public String toString() {
		return "RegisterOrUpdateHospitalDetails [header=" + header + ", hospitalName=" + hospitalName + ", speciality="
				+ speciality + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address + "]";
	}
	
}
