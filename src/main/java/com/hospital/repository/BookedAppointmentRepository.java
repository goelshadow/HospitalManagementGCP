package com.hospital.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.entity.BookedSlotInfo;

@Repository
public interface BookedAppointmentRepository extends JpaRepository<BookedSlotInfo, Long> {

	@Query(value = "select * from BOOKED_SLOT_INFO WHERE DOCTOR_USERNAME=:username AND SLOT_DATE=:slotDate AND HOSPITAL_ID=:hospitalId" , nativeQuery = true )
	public BookedSlotInfo findByUserNameAndSlotDate(@Param("username") String username,
			@Param("slotDate") Date slotDate,@Param("hospitalId") String hospitalId);
	
}
