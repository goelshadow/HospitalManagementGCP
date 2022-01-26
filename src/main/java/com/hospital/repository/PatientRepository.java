package com.hospital.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hospital.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

	public Optional<Patient> findByUserName(@Param("patientId") String patientId);

}
