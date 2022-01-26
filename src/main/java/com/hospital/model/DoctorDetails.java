package com.hospital.model;

import java.util.List;
import com.hospital.entity.Doctor;
import com.hospital.entity.BookedSlotInfo;

public class DoctorDetails {

	private Doctor doctor;
	private List<BookedSlotInfo> listDoctorTiings;
	
	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public List<BookedSlotInfo> getListDoctorTiings() {
		return listDoctorTiings;
	}

	public void setListDoctorTiings(List<BookedSlotInfo> listDoctorTiings) {
		this.listDoctorTiings = listDoctorTiings;
	}

}
