package com.hospital.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital.entity.DoctorScheduleManagement;

@Repository
public interface DoctorScheduleRepository extends JpaRepository<DoctorScheduleManagement, Long> {

	@Query(value = "select * from DOCTOR_SCHEDULE_MANAGEMENT WHERE USERNAME=:username AND SCHEDULE_DATE=:scheduleDate AND HOSPITAL_ID=:hospitalId" , nativeQuery = true )
	public DoctorScheduleManagement findByUserNameAndScheduleDate(@Param("username") String username,
			@Param("scheduleDate") Date scheduleDate,@Param("hospitalId") String hospitalId);
}
