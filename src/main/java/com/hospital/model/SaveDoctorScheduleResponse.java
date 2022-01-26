package com.hospital.model;

import java.io.Serializable;

public class SaveDoctorScheduleResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String userName;
	private String respCode;
	private String respDesc;
	
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
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespDesc() {
		return respDesc;
	}
	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	@Override
	public String toString() {
		return "SaveDoctorScheduleResponse [header=" + header + ", userName=" + userName + ", respCode=" + respCode
				+ ", respDesc=" + respDesc + "]";
	}
}
