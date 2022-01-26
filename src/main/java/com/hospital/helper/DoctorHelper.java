package com.hospital.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.constant.StaffConstants;
import com.hospital.entity.Doctor;
import com.hospital.model.RegisterOrUpdateDoctorRequest;
import com.hospital.util.CommonUtil;

@Service
public class DoctorHelper {

	@Autowired
	CommonUtil commonUtil;

	public Doctor createEntryInStaffTableRequest(RegisterOrUpdateDoctorRequest request, String generatedUserName) {

		Doctor staff = new Doctor();
		staff.setUserName(generatedUserName);
		staff.setPassword(request.getPassword());
//		staff.setHospitalId(request.getHeader().getHospitalId());
		staff.setFirstName(request.getFirstName());
		staff.setMiddleName(request.getMiddleName());
		staff.setLastName(request.getLastName());
		staff.setAge(request.getAge());
		staff.setGender(request.getGender());
		staff.setPhone(request.getPhone());
		staff.setEmail(request.getEmail());
		staff.setSpeciality(request.getProfession());
		staff.setAddress(request.getAddress());
		staff.setCreatedOn(commonUtil.getTodaysDate());
		staff.setCreatedBy(StaffConstants.REGISTER_STAFF_SERVICE_NAME);
		staff.setLastUpdatedOn(commonUtil.getTodaysDate());
		staff.setLastUpdatedBy(StaffConstants.REGISTER_STAFF_SERVICE_NAME);
		return staff;
	}

	public Doctor updateEntryInStaffTableRequest(RegisterOrUpdateDoctorRequest request, Doctor staff) {

//		staff.setHospitalId(request.getHeader().getHospitalId());
		staff.setFirstName(request.getFirstName());
		staff.setMiddleName(request.getMiddleName());
		staff.setLastName(request.getLastName());
		staff.setAge(request.getAge());
		staff.setGender(request.getGender());
		staff.setPhone(request.getPhone());
		staff.setEmail(request.getEmail());
		staff.setSpeciality(request.getProfession());
		staff.setAddress(request.getAddress());
		staff.setLastUpdatedOn(commonUtil.getTodaysDate());
		staff.setLastUpdatedBy(StaffConstants.UPDATE_STAFF_SERVICE_NAME);
		return staff;
	}
}
