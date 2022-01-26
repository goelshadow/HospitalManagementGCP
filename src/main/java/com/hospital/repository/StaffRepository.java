package com.hospital.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

	
	public Optional<Staff> findByPhone(@Param("phone") String phone);
//	public ArrayList<Staff> findBySpeciality(@Param("speciality") String speciality);
//	public ArrayList<Staff> findByFirstName(@Param("firstName") String firstName);
//	public ArrayList<Staff> findByLastName(@Param("lastName") String lastName);
	
}
