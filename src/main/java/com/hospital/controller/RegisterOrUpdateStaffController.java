package com.hospital.controller;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.constant.StaffConstants;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.model.RegisterOrUpdateStaffResponse;
import com.hospital.service.RegisterOrUpdateStaffService;
import com.hospital.util.LoggerUtil;
import com.hospital.util.StaffUtil;

@RestController
public class RegisterOrUpdateStaffController {

	@Autowired
	RegisterOrUpdateStaffService registerOrUpdateStaffService;

	@PostMapping(path = "/registerstaff")
	public RegisterOrUpdateStaffResponse registerStaff(@RequestBody RegisterOrUpdateStaffRequest request) {
		
		RegisterOrUpdateStaffResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			response = registerOrUpdateStaffService.registerStaff(request);
		}catch(ConstraintViolationException | DataIntegrityViolationException e) {
			LoggerUtil.printErrorLogs("ConstraintViolationException Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.CONSTRAINT_VIOLATION_EXCEPTION_CODE, StaffConstants.CONSTRAINT_VIOLATION_EXCEPTION_DESC, "");
		}
		catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.EXCEPTION_CODE, StaffConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
	
	@PostMapping(path = "/updatestaff")
	public RegisterOrUpdateStaffResponse updateStaff(@RequestBody RegisterOrUpdateStaffRequest request) {
		
		RegisterOrUpdateStaffResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			if(!StringUtils.isBlank(request.getPhone())) {
				response = registerOrUpdateStaffService.updateStaff(request);
			}else {
				return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.FAILURE_CODE, StaffConstants.USER_NAME_EMPTY, "");
			}
		} catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.EXCEPTION_CODE, StaffConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}

	@PostMapping(path = "/updatestaffbyadmin")
	public RegisterOrUpdateStaffResponse updateStaffByAdmin(@RequestBody RegisterOrUpdateStaffRequest request) {
		
		RegisterOrUpdateStaffResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Request received:", request, false);
			if(!StringUtils.isBlank(request.getPhone())) {
				response = registerOrUpdateStaffService.updateStaffByAdmin(request);
			}else {
				return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.FAILURE_CODE, StaffConstants.USER_NAME_EMPTY, "");
			}
		} catch(Exception e) {
			LoggerUtil.printErrorLogs("Exception Occured:", e);
			response = StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.EXCEPTION_CODE, StaffConstants.EXCEPTION_DESC, "");
		}
		LoggerUtil.printInfoLogs("Response sent:", response, false);
		return response;
	}
}
