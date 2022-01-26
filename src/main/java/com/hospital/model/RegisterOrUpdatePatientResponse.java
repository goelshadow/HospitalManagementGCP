package com.hospital.model;

public class RegisterOrUpdatePatientResponse {

	private String responseCode;
	private String responseDesc;
	private Header header;
	private String patientUserName;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getPatientUserName() {
		return patientUserName;
	}
	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdatePatientResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc
				+ ", header=" + header + ", patientUserName=" + patientUserName + "]";
	}
	
}
