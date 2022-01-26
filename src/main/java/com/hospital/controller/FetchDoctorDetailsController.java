package com.hospital.controller;

import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.entity.Doctor;
import com.hospital.model.FetchDoctorDeatilsRequest;
import com.hospital.service.FetchDoctorDetailsService;

@RestController
public class FetchDoctorDetailsController {
	
	@Autowired
	FetchDoctorDetailsService fetchDoctorDetailsService;

	@PostMapping("/fetchDoctorDetails")
	public ArrayList<Doctor> fetchDoctorWithSpeciality(@RequestBody FetchDoctorDeatilsRequest request) {
		
		ArrayList<Doctor> response = null;
		try {
			if(StringUtils.isNotBlank(request.getDoctorName())) {
				response = fetchDoctorDetailsService.fetchDoctorDetailsWithName(request);
			} else if(StringUtils.isNotBlank(request.getSpeciality())){
				response = fetchDoctorDetailsService.fetchDoctorDetailsOnSpeciality(request);
			} else {
//				buildResponse();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return response;
	}
}
