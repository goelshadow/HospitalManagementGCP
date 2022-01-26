package com.hospital.model;

import java.io.Serializable;

public class FetchDoctorDeatilsRequest implements Serializable {

	private String speciality;
	private String doctorName;
	private Header header;
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	@Override
	public String toString() {
		return "FetchDoctorDeatilsRequest [speciality=" + speciality + ", doctorName=" + doctorName + ", header="
				+ header + "]";
	}
}
