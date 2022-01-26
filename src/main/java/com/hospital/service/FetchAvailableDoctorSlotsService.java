package com.hospital.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospital.entity.BookedSlotInfo;
import com.hospital.entity.DoctorScheduleManagement;
import com.hospital.model.FetchAvailableDoctorSlotsRequest;
import com.hospital.model.FetchAvailableDoctorSlotsResponse;
import com.hospital.repository.DoctorScheduleRepository;
import com.hospital.util.BookingUtil;
import com.hospital.repository.BookedAppointmentRepository;

@Service
public class FetchAvailableDoctorSlotsService {

	@Autowired
	DoctorScheduleRepository doctorScheduleRepository;
	
	@Autowired
	BookedAppointmentRepository bookedAppointmentRepository;
	
	/*
	 * public FetchAvailableDoctorSlotsResponse
	 * fetchAvailableDoctorSlots(FetchAvailableDoctorSlotsRequest request) throws
	 * JsonParseException, JsonMappingException, IOException, ParseException {
	 * 
	 * ArrayList<String> availableTimeSlotsList = null; Date date1=new
	 * SimpleDateFormat("dd/MM/yyyy").parse(request.getBookingDate());
	 * DoctorScheduleManagement doctorSchedule =
	 * doctorScheduleRepository.findByUserNameAndScheduleDate(request.
	 * getDoctorUserName(), date1, request.getHeader().getHospitalId()); if(null !=
	 * doctorSchedule) { int length = doctorSchedule.getSlotTimings().length();
	 * String subStr = doctorSchedule.getSlotTimings().substring(1, length-1);
	 * String[] slots = subStr.split(","); BookedSlotInfo slotInfo =
	 * bookedAppointmentRepository.findByUserNameAndSlotDate(request.
	 * getDoctorUserName(), date1, request.getHeader().getHospitalId());
	 * ObjectMapper obj = new ObjectMapper(); HashMap<String, String> map = null;
	 * if(slotInfo != null) { map = obj.readValue(slotInfo.getTimeAndPatient(),
	 * HashMap.class); } availableTimeSlotsList = new ArrayList<>(); // String[]
	 * time = slots[0].split("-"); for(String slot : slots) { String[] time =
	 * slot.split("-"); LocalTime localTime = LocalTime.parse( time[0].trim() );
	 * LocalTime deadline = LocalTime.parse( time[1].trim() );
	 * if(localTime.isBefore(deadline)) { do { if(null != map) {
	 * if(StringUtils.isBlank(map.get(localTime.toString())) ||
	 * map.get(localTime.toString())==null) {
	 * availableTimeSlotsList.add(localTime.toString()); } } else {
	 * availableTimeSlotsList.add(localTime.toString()); } localTime =
	 * localTime.plusMinutes(Integer.valueOf(doctorSchedule.getAverageConsultingTime
	 * ())); }while(localTime.isBefore(deadline)); } } } return
	 * BookingUtil.buildResponse(request, availableTimeSlotsList); }
	 */

}
