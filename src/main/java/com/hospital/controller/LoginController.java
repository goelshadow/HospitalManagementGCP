package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hospital.constant.LoginConstants;
import com.hospital.model.LoginRequest;
import com.hospital.model.LoginResponse;
import com.hospital.service.LoginService;
import com.hospital.util.LoggerUtil;
import com.hospital.util.LoginUtil;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping(path = "/employeelogin")
	public LoginResponse login(@RequestBody LoginRequest request) {
		
		LoginResponse response = null;
		try {
			LoggerUtil.printInfoLogs("Login request received:", request, true);
			response = loginService.doLogin(request );
		}catch(Exception e) {
			response = LoginUtil.buildResponse(request.getHeader(),LoginConstants.EXCEPTION_CODE, LoginConstants.EXCEPTION_DESC);
			LoggerUtil.printErrorLogs("Exception Occured:",e);
		}
		LoggerUtil.printInfoLogs("Login response sent:", response, true);
		return response;
	}
}
