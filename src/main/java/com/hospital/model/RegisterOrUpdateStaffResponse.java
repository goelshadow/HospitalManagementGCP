package com.hospital.model;

public class RegisterOrUpdateStaffResponse {
	
	private String responseCode;
	private String responseDesc;
	private Header header;
	private String generatedEmployeeId;
	
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
	public String getGeneratedEmployeeId() {
		return generatedEmployeeId;
	}
	public void setGeneratedEmployeeId(String generatedEmployeeId) {
		this.generatedEmployeeId = generatedEmployeeId;
	}
	@Override
	public String toString() {
		return "RegisterOrUpdateStaffResponse [responseCode=" + responseCode + ", responseDesc=" + responseDesc
				+ ", header=" + header + ", generatedEmployeeId=" + generatedEmployeeId + "]";
	}
}
