package com.hospital.util;

import org.springframework.stereotype.Component;

import com.hospital.model.Header;
import com.hospital.model.LoginResponse;

@Component
public class LoginUtil {

	public static LoginResponse buildResponse(Header header, String respCode, String respDesc) {
		LoginResponse response = new LoginResponse();
		response.setHeader(header);
		response.setResponseCode(respCode);
		response.setResponseDesc(respDesc);
		return response;
	}
}
