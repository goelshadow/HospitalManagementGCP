package com.hospital.util;

import org.springframework.stereotype.Component;

import com.hospital.model.RegisterOrUpdateHospitalDetails;
import com.hospital.model.RegisterOrUpdateHospitalDetailsResponse;

@Component
public class HospitalUtil {

	public static RegisterOrUpdateHospitalDetailsResponse buildResponse(RegisterOrUpdateHospitalDetails request,int hospitalId,String respCode,String respDesc) {

		RegisterOrUpdateHospitalDetailsResponse response = new RegisterOrUpdateHospitalDetailsResponse();
		response.setHeader(request.getHeader());
		response.getHeader().setHospitalId(hospitalId);
		response.setRespCode(respCode);
		response.setRespDesc(respDesc);
		return response;
		
	}
}
