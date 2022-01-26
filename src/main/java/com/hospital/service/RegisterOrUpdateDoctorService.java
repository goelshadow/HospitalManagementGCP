package com.hospital.service;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hospital.constant.StaffConstants;
import com.hospital.entity.Doctor;
import com.hospital.helper.DoctorHelper;
import com.hospital.model.RegisterOrUpdateDoctorRequest;
import com.hospital.model.RegisterOrUpdateStaffResponse;
import com.hospital.repository.DoctorRepository;
import com.hospital.util.CommonUtil;
import com.hospital.util.LoggerUtil;
import com.hospital.util.StaffUtil;

@Component
public class RegisterOrUpdateDoctorService {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	CommonUtil commonUtil;

	@Autowired
	DoctorHelper doctorHelper;

	public RegisterOrUpdateStaffResponse registerDoctor(RegisterOrUpdateDoctorRequest request) {

		String generatedUserName = generateDoctorId(request);
		LoggerUtil.printInfoLogs("UserName generated:", generatedUserName, false);
		if (StringUtils.isBlank(generatedUserName)) {
			return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.FAILURE_CODE,StaffConstants.FAILURE_DESC, "");
		}
		Doctor doctor = doctorHelper.createEntryInStaffTableRequest(request, generatedUserName);
		LoggerUtil.printInfoLogs("Request for saving in staff table:", doctor, false);
		doctorRepository.save(doctor);
		return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,StaffConstants.SUCCESS_DESC, generatedUserName);
	}

	private String generateDoctorId(RegisterOrUpdateDoctorRequest request) {

		String userName = "";
		for (int digit = 3; digit < 7; digit++) {
			String username = generateUserName(request, digit);
			Optional<Doctor> s = doctorRepository.findByUserName(username);
			if (!s.isPresent()) {
				userName = username;
				break;
			}
		}
		return userName;
	}

	private String generateUserName(RegisterOrUpdateDoctorRequest request, int randomDigit) {

		String subLastName = request.getLastName().trim();
		String subFirstName = request.getFirstName().trim();
		if (subLastName.length() > 2)
			subLastName = subLastName.substring(0, 2);
		if (subFirstName.length() > 4)
			subFirstName = subFirstName.substring(0, 4);
		String finalStaffId = "D-" + subLastName + subFirstName + commonUtil.generateRandomDigit(randomDigit);
		return finalStaffId.toLowerCase();
	}

	public RegisterOrUpdateStaffResponse updateStaff(RegisterOrUpdateDoctorRequest request) {

		Optional<Doctor> staff1 = doctorRepository.findById(request.getStaffUserName());
		if (staff1.isPresent()) {
			Doctor staff = doctorHelper.updateEntryInStaffTableRequest(request, staff1.get());
			doctorRepository.save(staff);
		}
		return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,
				StaffConstants.SUCCESS_DESC, request.getStaffUserName());
	}

}
