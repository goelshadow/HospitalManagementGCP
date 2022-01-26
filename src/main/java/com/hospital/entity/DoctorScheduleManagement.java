package com.hospital.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DOCTOR_SCHEDULE_MANAGEMENT")
public class DoctorScheduleManagement {

	@Id
	@Column(name = "SCHEDULE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleId;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "HOSPITAL_ID")
	private String hospitalId;
	
	@Column(name = "SCHEDULE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date scheduleDate;
	
	@Column(name = "SLOT_TIMINGS ")
	private String slotTimings;
	
	@Column(name = "AVERAGE_CONSULTING_TIME_IN_MINS")
	private String averageConsultingTime;
	
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

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public String getSlotTimings() {
		return slotTimings;
	}

	public void setSlotTimings(String slotTimings) {
		this.slotTimings = slotTimings;
	}

	public String getAverageConsultingTime() {
		return averageConsultingTime;
	}

	public void setAverageConsultingTime(String averageConsultingTime) {
		this.averageConsultingTime = averageConsultingTime;
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
