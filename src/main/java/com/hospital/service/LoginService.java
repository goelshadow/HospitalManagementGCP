package com.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hospital.constant.LoginConstants;
import com.hospital.entity.Staff;
import com.hospital.model.LoginRequest;
import com.hospital.model.LoginResponse;
import com.hospital.repository.LoginRepository;
import com.hospital.util.LoggerUtil;
import com.hospital.util.LoginUtil;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	@Autowired
	Gson gson;

	public LoginResponse doLogin(LoginRequest loginRequest) {

		Staff staffResponse = loginRepository.findByPhone(loginRequest.getPhone());
		LoggerUtil.printInfoLogs("Response from EMPLOYEE table:", gson.toJson(staffResponse), true);
		if (null != staffResponse && loginRequest.getPassword().equals(staffResponse.getPassword())) {
			return LoginUtil.buildResponse(loginRequest.getHeader(), LoginConstants.SUCCESS_CODE,
					LoginConstants.SUCCESS_DESC);
		} else {
			return LoginUtil.buildResponse(loginRequest.getHeader(), LoginConstants.FAILURE_CODE,
					LoginConstants.FAILURE_DESC);
		}
	}
}
