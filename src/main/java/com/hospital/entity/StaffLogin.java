package com.hospital.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAFF_LOGIN")
public class StaffLogin {

	@Id

	@Column(name = "STAFF_ID")
	private String staffId;

	@Column(name = "HOSPITAL_ID")
	private String hospitalId;

	@Column(name = "PASSWORD")
	private String pazzwrd;

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getPazzwrd() {
		return pazzwrd;
	}

	public void setPazzwrd(String pazzwrd) {
		this.pazzwrd = pazzwrd;
	}

}
