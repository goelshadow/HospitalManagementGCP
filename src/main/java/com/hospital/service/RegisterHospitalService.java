package com.hospital.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.hospital.constant.HospitalConstants;
import com.hospital.entity.Hospital;
import com.hospital.model.RegisterOrUpdateHospitalDetails;
import com.hospital.model.RegisterOrUpdateHospitalDetailsResponse;
import com.hospital.repository.HospitalRepository;
import com.hospital.util.CommonUtil;
import com.hospital.util.HospitalUtil;
import com.hospital.util.LoggerUtil;

@Service
public class RegisterHospitalService {

	@Autowired
	HospitalRepository hospitalRepository;
	
	@Autowired
	CommonUtil commonUtil;
	
	@Autowired
	Gson gson;

	public RegisterOrUpdateHospitalDetailsResponse registerHospital(RegisterOrUpdateHospitalDetails request) {
		
		Hospital hospital = new Hospital();
		String hospitalId = generateHospitalId();
		LoggerUtil.printInfoLogs("Hospital Id generated", hospitalId, false);
		hospital.setHospitalId(hospitalId);
		hospital.setAddress(request.getAddress());
		hospital.setPhoneNumber(request.getPhoneNumber());
		hospital.setEmail(request.getEmail());
		hospital.setHospitalName(request.getHospitalName());
		hospital.setSpeciality(request.getSpeciality());
		hospital.setCreatedOn(commonUtil.getTodaysDate());
		hospital.setCreatedBy(HospitalConstants.ADD_HOSPITAL);
		hospitalRepository.save(hospital);
		LoggerUtil.printInfoLogs("Successfully saved data into database", gson.toJson(hospital), false);
		return HospitalUtil.buildResponse(request, 1234, HospitalConstants.SUCCESS_CODE, HospitalConstants.SUCCESS_DESC);
	}
	
	public String generateHospitalId() {
		
		int count = 3;
		String hospitalId = "";
		do {
			hospitalId = "H" + commonUtil.generateRandomDigit(count);
			Hospital hospital = hospitalRepository.findByHospitalId(hospitalId);
			if(hospital != null) {
				hospitalId = "";
			}
			count++;
		} while(StringUtils.isBlank(hospitalId));
		return hospitalId;
	}
	
}
