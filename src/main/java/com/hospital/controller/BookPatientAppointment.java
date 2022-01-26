package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.service.BookPatientAppointmentService;
import com.hospital.model.DoctorPatientSlotBookingRequest;

@RestController
public class BookPatientAppointment {

	@Autowired
	BookPatientAppointmentService bookPatientAppointmentService;
	
	@PostMapping("bookDoctorTimeSlot")
	public void bookAppointment(@RequestBody DoctorPatientSlotBookingRequest request) {
		
		try {
			bookPatientAppointmentService.bookAppointment(request);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
