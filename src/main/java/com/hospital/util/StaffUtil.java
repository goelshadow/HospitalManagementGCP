package com.hospital.util;

import org.springframework.stereotype.Component;

import com.hospital.model.Header;
import com.hospital.model.RegisterOrUpdateStaffResponse;

@Component
public class StaffUtil {

	public static RegisterOrUpdateStaffResponse buildRegisterStaffResponse(Header header,String respCode, String respDesc,String generatedEmployeeId) {
		
		RegisterOrUpdateStaffResponse response = new RegisterOrUpdateStaffResponse();
		response.setHeader(header);
		response.setResponseCode(respCode);
		response.setResponseDesc(respDesc);
		response.setGeneratedEmployeeId(generatedEmployeeId);
		return response;
	}
	
	public static RegisterOrUpdateStaffResponse buildUpdateStaffResponse(Header header, String respCode,
			String respDesc, String generatedEmployeeId) {

		RegisterOrUpdateStaffResponse response = new RegisterOrUpdateStaffResponse();
		response.setHeader(header);
		response.setResponseCode(respCode);
		response.setResponseDesc(respDesc);
		response.setGeneratedEmployeeId(generatedEmployeeId);
		return response;
	}
}
