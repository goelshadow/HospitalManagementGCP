package com.hospital.util;

import java.util.ArrayList;

import com.hospital.model.FetchAvailableDoctorSlotsRequest;
import com.hospital.model.FetchAvailableDoctorSlotsResponse;

public class BookingUtil {
	
	public static FetchAvailableDoctorSlotsResponse buildResponse(FetchAvailableDoctorSlotsRequest request,ArrayList<String> list) {
		
		FetchAvailableDoctorSlotsResponse response = new FetchAvailableDoctorSlotsResponse();
		response.setBookingDate(request.getBookingDate());
		response.setDoctorUserName(request.getDoctorUserName());
		response.setHeader(request.getHeader());
		response.setAvailableDoctorSlots(list);
		return response;
		
	}
}
