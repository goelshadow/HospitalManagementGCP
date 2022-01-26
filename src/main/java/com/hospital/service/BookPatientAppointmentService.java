package com.hospital.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospital.entity.BookedSlotInfo;
import com.hospital.model.DoctorPatientSlotBookingRequest;
import com.hospital.util.CommonUtil;
import com.hospital.repository.BookedAppointmentRepository;

@Service
public class BookPatientAppointmentService {
	
	@Autowired
	CommonUtil commonUtil;
	
	@Autowired
	BookedAppointmentRepository bookedAppointmentRepository;

	public void bookAppointment(DoctorPatientSlotBookingRequest request) throws ParseException, IOException {
		
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(request.getSlotDate());
//		BookedSlotInfo slotInfo = bookedAppointmentRepository.findByUserNameAndSlotDate(request.getDoctorUserName(), date1, request.getHeader().getHospitalId());
		BookedSlotInfo bookedSlotInfoRequest = null;
//		if(slotInfo != null) {
//			bookedSlotInfoRequest = updateExistingRequest(request,slotInfo);
//		} else {
//			bookedSlotInfoRequest = createBusinessRequest(request);
//		}
		bookedAppointmentRepository.save(bookedSlotInfoRequest);
	}

	private BookedSlotInfo updateExistingRequest(DoctorPatientSlotBookingRequest request, BookedSlotInfo bookedSlotInfo) throws JsonParseException, JsonMappingException, IOException {

		bookedSlotInfo.setLastUpdatedBy("BookPatientAppt");
		bookedSlotInfo.setLastUpdatedOn(commonUtil.getTodaysDate());
		ObjectMapper ob = new ObjectMapper();
		HashMap<String, String> map = ob.readValue(bookedSlotInfo.getTimeAndPatient(), HashMap.class);
		map.put(request.getSlotTime(), request.getPatientId());
		byte[] a = ob.writeValueAsBytes(map);
		bookedSlotInfo.setTimeAndPatient(a);
		return bookedSlotInfo;
	}

	private BookedSlotInfo createBusinessRequest(DoctorPatientSlotBookingRequest request) throws ParseException, JsonProcessingException {
		
		BookedSlotInfo bookedSlotInfo = new BookedSlotInfo();
		bookedSlotInfo.setCreatedBy("BookPatientAppt");
		bookedSlotInfo.setCreatedOn(commonUtil.getTodaysDate());
		bookedSlotInfo.setDoctorUserName(request.getDoctorUserName());
//		bookedSlotInfo.setHospitalId(request.getHeader().getHospitalId());
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(request.getSlotDate()); 
		bookedSlotInfo.setSlotDate(date1);
		HashMap<String, String> map = new HashMap<>();
		map.put(request.getSlotTime(), request.getPatientId());
//		String data = request.getSlotTime()+"|"+request.getPatientId();
		ObjectMapper ob = new ObjectMapper();
		byte[] a = ob.writeValueAsBytes(map);
		bookedSlotInfo.setTimeAndPatient(a);
		return bookedSlotInfo;
	}
}
