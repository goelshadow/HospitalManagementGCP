package com.hospital.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.constant.PatientConstants;
import com.hospital.entity.Patient;
import com.hospital.model.RegisterOrUpdatePatientRequest;
import com.hospital.util.CommonUtil;

@Service
public class PatientHelper {

	@Autowired
	CommonUtil commonUtil;
	
	public Patient createEntryInPatientTableRequest(RegisterOrUpdatePatientRequest request,String userName) {
		
		Patient patient = new Patient();
		patient.setAddress(request.getAddress());
		patient.setAge(request.getAge());
		patient.setCreatedBy(PatientConstants.REGISTER_PATIENT_SERVICE_NAME);
		patient.setCreatedOn(commonUtil.getTodaysDate());
		patient.setEmail(request.getEmail());
		patient.setFirstName(request.getFirstName());
		patient.setGender(request.getGender());
		patient.setLastName(request.getLastName());
		patient.setLastUpdatedBy(PatientConstants.REGISTER_PATIENT_SERVICE_NAME);
		patient.setLastUpdatedOn(commonUtil.getTodaysDate());
		patient.setMiddleName(request.getMiddleName());
		patient.setPhone(request.getPhone());
		patient.setProblem(request.getProblem());
		patient.setUserName(userName);
		return patient;
	}
	
	public Patient updateEntryInPatientTableRequest(RegisterOrUpdatePatientRequest request,Patient patient) {
		
		patient.setAddress(request.getAddress());
		patient.setAge(request.getAge());
		patient.setCreatedBy(PatientConstants.UPDATE_PATIENT_SERVICE_NAME);
		patient.setCreatedOn(commonUtil.getTodaysDate());
		patient.setEmail(request.getEmail());
		patient.setFirstName(request.getFirstName());
		patient.setGender(request.getGender());
		patient.setLastName(request.getLastName());
		patient.setLastUpdatedBy(PatientConstants.UPDATE_PATIENT_SERVICE_NAME);
		patient.setLastUpdatedOn(commonUtil.getTodaysDate());
		patient.setMiddleName(request.getMiddleName());
		patient.setPhone(request.getPhone());
		patient.setProblem(request.getProblem());
		return patient;
	}
}
