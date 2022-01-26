package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.model.SaveDoctorScheduleRequest;
import com.hospital.model.SaveDoctorScheduleResponse;
import com.hospital.service.SaveDoctorScheduleService;
import com.hospital.util.LoggerUtil;

@RestController
public class SaveDoctorScheduleController {
	
	@Autowired
	SaveDoctorScheduleService registerDoctorWorkTimingsService;

	@PostMapping("/saveTimings")
	public SaveDoctorScheduleResponse registerWorkTime(@RequestBody SaveDoctorScheduleRequest request) {
		
		SaveDoctorScheduleResponse response = null;
		LoggerUtil.printInfoLogs("Request received for saveDoctor timings: ", request, false);
		try {
			response = registerDoctorWorkTimingsService.registerWorkTime(request);
		}catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured", e);
		}
		return response;
	}
}
