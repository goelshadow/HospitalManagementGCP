package com.hospital.util;

import org.springframework.stereotype.Component;

import com.hospital.model.Header;
import com.hospital.model.RegisterOrUpdatePatientResponse;

@Component
public class PatientUtil {
	
	public static RegisterOrUpdatePatientResponse buildRegisterPatientResponse(Header header,String respCode, String respDesc,String patientUserName) {
		
		RegisterOrUpdatePatientResponse response = new RegisterOrUpdatePatientResponse();
		response.setHeader(header);
		response.setResponseCode(respCode);
		response.setResponseDesc(respDesc);
		response.setPatientUserName(patientUserName);
		return response;
	}

}
