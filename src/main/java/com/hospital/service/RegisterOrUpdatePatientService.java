package com.hospital.service;

import java.util.Optional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hospital.constant.PatientConstants;
import com.hospital.entity.Patient;
import com.hospital.helper.PatientHelper;
import com.hospital.model.RegisterOrUpdatePatientRequest;
import com.hospital.model.RegisterOrUpdatePatientResponse;
import com.hospital.repository.PatientRepository;
import com.hospital.util.CommonUtil;
import com.hospital.util.LoggerUtil;
import com.hospital.util.PatientUtil;

@Service
public class RegisterOrUpdatePatientService {

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	PatientHelper patientHelper;

	@Autowired
	CommonUtil commonUtil;

	@Autowired
	PatientUtil patientUtil;

	public RegisterOrUpdatePatientResponse registerPatient(RegisterOrUpdatePatientRequest request) {

		String generatedUserName = generateUserName(request);
		LoggerUtil.printInfoLogs("UserName generated:", generatedUserName, false);
		if (StringUtils.isBlank(generatedUserName)) {
			return PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.FAILURE_CODE,
					PatientConstants.FAILURE_DESC, "");
		}
		Patient patient = patientHelper.createEntryInPatientTableRequest(request,generatedUserName);
		LoggerUtil.printInfoLogs("Request for saving in Patient table:", patient, false);
		patientRepository.save(patient);
		return PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.SUCCESS_CODE,
				PatientConstants.SUCCESS_DESC, generatedUserName);
	}

	private String generateUserName(RegisterOrUpdatePatientRequest request) {
		String userName = "";
		for (int digit = 3; digit < 7; digit++) {
			String username = generateUserName(request, digit);
			Optional<Patient> s = patientRepository.findByUserName(username);
			if (!s.isPresent()) {
				userName = username;
				break;
			}
		}
		return userName;
	}

	private String generateUserName(RegisterOrUpdatePatientRequest request, int randomDigit) {

		String subLastName = request.getLastName().trim();
		String subFirstName = request.getFirstName().trim();
		if (subLastName.length() > 2)
			subLastName = subLastName.substring(0, 2);
		if (subFirstName.length() > 4)
			subFirstName = subFirstName.substring(0, 4);
		String finalStaffId = subLastName + subFirstName + commonUtil.generateRandomDigit(randomDigit);
		return finalStaffId.toLowerCase();
	}

	public String generatePatientId() {

		Optional<Patient> isPatientIdAlreadyExists = null;
		String generatePatientId = null;
		do {
			int count = 6;
			generatePatientId = commonUtil.generateRandomDigit(count);
			isPatientIdAlreadyExists = patientRepository.findById(generatePatientId);
		} while (null != isPatientIdAlreadyExists && isPatientIdAlreadyExists.isPresent());
		return generatePatientId;
	}

	public RegisterOrUpdatePatientResponse updatePatientRecord(RegisterOrUpdatePatientRequest request) {

		Optional<Patient> patient = patientRepository.findById(request.getPatientId());
		if (patient.isPresent()) {
			Patient updatedPatient = patientHelper.updateEntryInPatientTableRequest(request, patient.get());
			patientRepository.save(updatedPatient);
		}
		return PatientUtil.buildRegisterPatientResponse(request.getHeader(), PatientConstants.SUCCESS_CODE,
				PatientConstants.SUCCESS_DESC, request.getPatientId());
	}
}
