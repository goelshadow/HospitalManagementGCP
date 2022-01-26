package com.hospital.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.DoctorScheduleManagement;
import com.hospital.model.SaveDoctorScheduleRequest;
import com.hospital.model.SaveDoctorScheduleResponse;
import com.hospital.model.Slots;
import com.hospital.repository.DoctorScheduleRepository;
import com.hospital.util.CommonUtil;

@Service
public class SaveDoctorScheduleService {

	@Autowired
	DoctorScheduleRepository registerDoctorWorkTimingsRepository;
	
	@Autowired
	CommonUtil commonUtil;
	
	public SaveDoctorScheduleResponse registerWorkTime(SaveDoctorScheduleRequest request) {
		
		for(Entry<String, List<String>> slot : request.getScheduleDateAndTime().entrySet()) {
			DoctorScheduleManagement entityRequest;
			try {
				entityRequest = createBusinessRequest(request,slot);
				registerDoctorWorkTimingsRepository.save(entityRequest);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	private DoctorScheduleManagement createBusinessRequest(SaveDoctorScheduleRequest request,Entry<String, List<String>> slot) throws ParseException {
		
		DoctorScheduleManagement registerDoctorWorkTimings = new DoctorScheduleManagement();
//		registerDoctorWorkTimings.setHospitalId(request.getHeader().getHospitalId());
		registerDoctorWorkTimings.setUserName(request.getUserName());
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(slot.getKey());  
		registerDoctorWorkTimings.setScheduleDate(date1);
		registerDoctorWorkTimings.setSlotTimings(String.valueOf(slot.getValue()));
		registerDoctorWorkTimings.setAverageConsultingTime(request.getAverageConsultingTime());
		registerDoctorWorkTimings.setCreatedOn(commonUtil.getTodaysDate());
		registerDoctorWorkTimings.setCreatedBy("RegisterDoctorWork");
		registerDoctorWorkTimings.setLastUpdatedOn(commonUtil.getTodaysDate());
		registerDoctorWorkTimings.setLastUpdatedBy("RegisterDoctorWork");
		return registerDoctorWorkTimings;
	}

	private String generateSlotsIntoString(Slots slot) {
		
		return slot.getStartTime()+" to "+slot.getEndTime();
	}
}
