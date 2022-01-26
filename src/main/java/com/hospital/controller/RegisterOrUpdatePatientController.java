package com.hospital.controller;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.constant.PatientConstants;
import com.hospital.model.RegisterOrUpdatePatientRequest;
import com.hospital.model.RegisterOrUpdatePatientResponse;
import com.hospital.service.RegisterOrUpdatePatientService;
import com.hospital.util.LoggerUtil;
import com.hospital.util.PatientUtil;

@RestController
public class RegisterOrUpdatePatientController {
	
	@Autowired
	RegisterOrUpdatePatientService registerOrUpdatePatientService;

	@PostMapping(path = "/registerPatient")
	public RegisterOrUpdatePatientResponse registerPatient(@RequestBody RegisterOrUpdatePatientRequest request) {
		
		RegisterOrUpdatePatientResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			response = registerOrUpdatePatientService.registerPatient(request);
		}catch(ConstraintViolationException | DataIntegrityViolationException e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.CONSTRAINT_VIOLATION_EXCEPTION_CODE, PatientConstants.CONSTRAINT_VIOLATION_EXCEPTION_DESC, "");
		}catch(Exception e) {
			LoggerUtil.printErrorLogs("ConstraintViolationException Occured:", e);
			response = PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.EXCEPTION_CODE, PatientConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
	
	@PostMapping(path = "/updatePatient")
	public RegisterOrUpdatePatientResponse updatePatient(@RequestBody RegisterOrUpdatePatientRequest request) {
		
		RegisterOrUpdatePatientResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			response = registerOrUpdatePatientService.updatePatientRecord(request);
		}catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.EXCEPTION_CODE, PatientConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
}
