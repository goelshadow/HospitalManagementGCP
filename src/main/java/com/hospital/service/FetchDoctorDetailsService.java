package com.hospital.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.entity.Doctor;
import com.hospital.entity.BookedSlotInfo;
import com.hospital.entity.Hospital;
import com.hospital.model.DoctorDetails;
import com.hospital.model.DoctorDetailsResponse;
import com.hospital.model.FetchDoctorDeatilsRequest;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.BookedAppointmentRepository;
import com.hospital.repository.HospitalRepository;

@Service
public class FetchDoctorDetailsService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	BookedAppointmentRepository doctorTimingsRepository;
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	public ArrayList<Doctor> fetchDoctorDetailsOnSpeciality(FetchDoctorDeatilsRequest request) {
	
		ArrayList<Doctor> listDoctors = doctorRepository.findBySpeciality(request.getSpeciality());
		if(null != listDoctors && listDoctors.size()>0) {
			return listDoctors;
		}
		return listDoctors;
	}
	
	public ArrayList<Doctor> fetchDoctorDetailsWithName(FetchDoctorDeatilsRequest request) {
		
		ArrayList<Doctor> listDoctors = doctorRepository.findByFirstName(request.getDoctorName());
		if(null != listDoctors && listDoctors.size()>0) {
			return listDoctors;
		} else {
			ArrayList<Doctor> listDoctorsWithLatName = doctorRepository.findByLastName(request.getDoctorName());
			if(null != listDoctorsWithLatName && listDoctorsWithLatName.size()>0) {
				return listDoctorsWithLatName;
			}
		}
		return listDoctors;
	}
	
}
