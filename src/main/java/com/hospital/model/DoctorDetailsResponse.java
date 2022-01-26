package com.hospital.model;

import java.util.HashMap;
import java.util.List;

import com.hospital.entity.Hospital;

public class DoctorDetailsResponse {
	
	public List<DoctorDetails> listDoctors;
	public Header header;
	private HashMap<String, Hospital> hospitalDetails;
	
	public List<DoctorDetails> getListDoctors() {
		return listDoctors;
	}
	public void setListDoctors(List<DoctorDetails> listDoctors) {
		this.listDoctors = listDoctors;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public HashMap<String, Hospital> getHospitalDetails() {
		return hospitalDetails;
	}
	public void setHospitalDetails(HashMap<String, Hospital> hospitalDetails) {
		this.hospitalDetails = hospitalDetails;
	}
}
