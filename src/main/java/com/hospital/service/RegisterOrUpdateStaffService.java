package com.hospital.service;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.constant.StaffConstants;
import com.hospital.entity.Staff;
import com.hospital.helper.StaffHelper;
import com.hospital.model.RegisterOrUpdateStaffRequest;
import com.hospital.model.RegisterOrUpdateStaffResponse;
import com.hospital.repository.StaffRepository;
import com.hospital.util.CommonUtil;
import com.hospital.util.LoggerUtil;
import com.hospital.util.StaffUtil;

@Service
public class RegisterOrUpdateStaffService {
	
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	CommonUtil commonUtil;
	
	@Autowired
	StaffHelper staffHelper;
	
	public RegisterOrUpdateStaffResponse registerStaff(RegisterOrUpdateStaffRequest request) {

		Staff staff = staffHelper.createEntryInStaffTableRequest(request);
		LoggerUtil.printInfoLogs("Request for saving in staff table:", staff, false);
		staffRepository.save(staff);
		return StaffUtil.buildRegisterStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,StaffConstants.SUCCESS_DESC, String.valueOf(staff.getEmployeeId()));
	}

	public RegisterOrUpdateStaffResponse updateStaff(RegisterOrUpdateStaffRequest request) {

		Optional<Staff> existingStaff = staffRepository.findByPhone(request.getPhone());
		Staff staff = null;
		if (existingStaff.isPresent()) {
			staff = staffHelper.updateEntryInStaffTableRequestByEmployee(request, existingStaff.get());
			staffRepository.save(staff);
		}
		return StaffUtil.buildUpdateStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,
				StaffConstants.SUCCESS_DESC,String.valueOf(staff.getEmployeeId()));
	}
	
	public RegisterOrUpdateStaffResponse updateStaffByAdmin(RegisterOrUpdateStaffRequest request) {

		Optional<Staff> existingStaff = staffRepository.findByPhone(request.getPhone());
		Staff staff = null;
		if (existingStaff.isPresent()) {
			staff = staffHelper.approveOrRejectEmployeeByAdmin(request, existingStaff.get());
			staffRepository.save(staff);
		}
		return StaffUtil.buildUpdateStaffResponse(request.getHeader(), StaffConstants.SUCCESS_CODE,
				StaffConstants.SUCCESS_DESC,String.valueOf(staff.getEmployeeId()));
	}

}
