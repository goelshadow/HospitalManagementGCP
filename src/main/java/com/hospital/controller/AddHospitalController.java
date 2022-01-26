package com.hospital.controller;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.constant.HospitalConstants;
import com.hospital.model.RegisterOrUpdateHospitalDetails;
import com.hospital.model.RegisterOrUpdateHospitalDetailsResponse;
import com.hospital.service.RegisterHospitalService;
import com.hospital.util.HospitalUtil;
import com.hospital.util.LoggerUtil;

@RestController
public class AddHospitalController {

	@Autowired
	RegisterHospitalService registerHospitalService;

	@PostMapping("/addHospital")
	public RegisterOrUpdateHospitalDetailsResponse registerHospital(@RequestBody RegisterOrUpdateHospitalDetails request) {
		
		RegisterOrUpdateHospitalDetailsResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Add new hospital request received!", request, false);
			response = registerHospitalService.registerHospital(request);
		}catch(ConstraintViolationException | DataIntegrityViolationException e) {
			LoggerUtil.printErrorLogs("ConstraintViolationException Occured:", e);
//			response = HospitalUtil.buildResponse(request, "", HospitalConstants.CONSTRAINT_VIOLATION_EXCEPTION_CODE, HospitalConstants.CONSTRAINT_VIOLATION_EXCEPTION_DESC);
		}catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception occured", e);
//			response = HospitalUtil.buildResponse(request, "", HospitalConstants.EXCEPTION_CODE, HospitalConstants.EXCEPTION_DESC);
		}
		LoggerUtil.printInfoLogs("Add new hospital response sent!", response, false);
		return response;
	}
	
}
