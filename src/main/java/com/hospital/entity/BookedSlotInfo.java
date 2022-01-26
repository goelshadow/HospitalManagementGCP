package com.hospital.entity;

import java.sql.Blob;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BOOKED_SLOT_INFO")
public class BookedSlotInfo {

	@Id
	@Column(name = "SLOT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int slotId;
	
	@Column(name = "HOSPITAL_ID")
	private String hospitalId;

	@Column(name = "DOCTOR_USERNAME")
	private String doctorUserName;

	@Column(name = "SLOT_DATE")
	private Date slotDate;
	
	@Lob
	@Column(name = "TIME_AND_PATIENT")
	private byte[] timeAndPatient;
	
	@Column(name = "CREATED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdOn;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "LAST_UPDATED_ON")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar lastUpdatedOn;

	@Column(name = "LAST_UPDATED_BY")
	private String lastUpdatedBy;

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getDoctorUserName() {
		return doctorUserName;
	}

	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}

	public Date getSlotDate() {
		return slotDate;
	}

	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}

	public byte[] getTimeAndPatient() {
		return timeAndPatient;
	}

	public void setTimeAndPatient(byte[] timeAndPatient) {
		this.timeAndPatient = timeAndPatient;
	}

	public Calendar getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Calendar createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Calendar lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	
}
