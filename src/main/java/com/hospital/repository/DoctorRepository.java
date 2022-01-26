package com.hospital.repository;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, String> {

	public Optional<Doctor> findByUserName(@Param("userName") String username);
	public ArrayList<Doctor> findBySpeciality(@Param("speciality") String speciality);
	public ArrayList<Doctor> findByFirstName(@Param("firstName") String firstName);
	public ArrayList<Doctor> findByLastName(@Param("lastName") String lastName);
	
}
