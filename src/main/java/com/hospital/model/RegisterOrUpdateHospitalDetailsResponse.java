package com.hospital.model;

import java.io.Serializable;

public class RegisterOrUpdateHospitalDetailsResponse implements Serializable {

	@Override
	public String toString() {
		return "RegisterOrUpdateHospitalDetailsResponse [respCode=" + respCode + ", respDesc=" + respDesc + ", header="
				+ header + "]";
	}
	private String respCode;
	private String respDesc;
	private Header header;
	
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
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
}
