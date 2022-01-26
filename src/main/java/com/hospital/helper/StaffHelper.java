package com.hospital.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.constant.StaffConstants;
import com.hospital.entity.Staff;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.util.CommonUtil;

@Service
public class StaffHelper {

	@Autowired
	CommonUtil commonUtil;

	public Staff createEntryInStaffTableRequest(RegisterOrUpdateStaffRequest request) {

		Staff staff = new Staff();
		staff.setHospitalId(request.getHeader().getHospitalId());
		String pass = "test@" + commonUtil.generateRandomDigit(5);
		staff.setPassword(pass);
		staff.setStatus(request.getActiveStatus());
		staff.setPhone(request.getPhone());
		staff.setCreatedOn(commonUtil.getTodaysDate());
		staff.setCreatedBy(StaffConstants.REGISTER_STAFF_SERVICE_NAME);
		return staff;
	}
	
	public Staff updateEntryInStaffTableRequestByEmployee(RegisterOrUpdateStaffRequest request, Staff staff) {

		staff.setFirstName(request.getFirstName());
		staff.setMiddleName(request.getMiddleName());
		staff.setLastName(request.getLastName());
		staff.setDob(request.getDob());
		staff.setGender(request.getGender());
		staff.setEmail(request.getEmail());
		staff.setAddress(request.getAddress());
		staff.setLastUpdatedOn(commonUtil.getTodaysDate());
		staff.setLastUpdatedBy(StaffConstants.UPDATE_STAFF_SERVICE_NAME);
		return staff;
	}
	  
	public Staff approveOrRejectEmployeeByAdmin(RegisterOrUpdateStaffRequest request, Staff staff) {

		staff.setStatus(request.getActiveStatus());
		staff.setProfession(request.getProfession());
		staff.setLastUpdatedOn(commonUtil.getTodaysDate());
		staff.setLastUpdatedBy(request.getAdminId());
		return staff;
	}
	  
	
	 
}
