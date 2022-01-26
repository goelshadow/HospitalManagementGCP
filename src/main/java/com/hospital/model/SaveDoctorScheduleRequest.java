package com.hospital.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class SaveDoctorScheduleRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String userName;
	private HashMap<String, List<String>> scheduleDateAndTime;
	private String averageConsultingTime;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public HashMap<String, List<String>> getScheduleDateAndTime() {
		return scheduleDateAndTime;
	}
	public void setScheduleDateAndTime(HashMap<String, List<String>> scheduleDateAndTime) {
		this.scheduleDateAndTime = scheduleDateAndTime;
	}
	public String getAverageConsultingTime() {
		return averageConsultingTime;
	}
	public void setAverageConsultingTime(String averageConsultingTime) {
		this.averageConsultingTime = averageConsultingTime;
	}
	@Override
	public String toString() {
		return "SaveDoctorScheduleRequest [header=" + header + ", userName=" + userName + ", scheduleDateAndTime="
				+ scheduleDateAndTime + ", averageConsultingTime=" + averageConsultingTime + "]";
	}
}
