package com.hospital.model;

public class FetchAvailableDoctorSlotsRequest {

	private Header header;
	private String doctorUserName;
	private String bookingDate;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getDoctorUserName() {
		return doctorUserName;
	}
	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	
}
