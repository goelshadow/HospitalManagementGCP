package com.hospital.model;

public class DoctorPatientSlotBookingRequest {

	private Header header;
	private String doctorUserName;
	private String slotDate;
	private String slotTime;
	private String patientId;
	
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
	public String getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(String slotDate) {
		this.slotDate = slotDate;
	}
	public String getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(String slotTime) {
		this.slotTime = slotTime;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	@Override
	public String toString() {
		return "DoctorPatientSlotBookingRequest [header=" + header + ", doctorUserName=" + doctorUserName
				+ ", slotDate=" + slotDate + ", slotTime=" + slotTime + ", patientId=" + patientId + "]";
	}
	
}
