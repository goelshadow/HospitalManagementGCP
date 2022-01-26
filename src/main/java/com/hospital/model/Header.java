package com.hospital.model;

public class Header {

	private int hospitalId;
	private String transId;
	private String channelId;
	
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	@Override
	public String toString() {
		return "Header [hospitalId=" + hospitalId + ", transId=" + transId + ", channelId=" + channelId + "]";
	}
}
