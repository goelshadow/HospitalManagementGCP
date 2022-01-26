package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.hospital.service.FetchAvailableDoctorSlotsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.FetchAvailableDoctorSlotsRequest;
import com.hospital.model.FetchAvailableDoctorSlotsResponse;

@RestController
public class FetchAvailableDoctorSlotsController {

	@Autowired
	FetchAvailableDoctorSlotsService fetchAvailableDoctorSlotsService;
	
	@PostMapping("/fetchDoctorAvailableSlots")
	public FetchAvailableDoctorSlotsResponse fetchAvailableDoctorSlots(@RequestBody FetchAvailableDoctorSlotsRequest request) {
		
		FetchAvailableDoctorSlotsResponse response = null;
		try {
//			response = fetchAvailableDoctorSlotsService.fetchAvailableDoctorSlots(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
	
}
