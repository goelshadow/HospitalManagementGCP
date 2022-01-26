package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Staff;

@Repository
public interface LoginRepository extends JpaRepository<Staff, String> {

//	@Query(value = "select * from STAFF WHERE USERNAME=:userName AND password=:pazzwrd" , nativeQuery = true )
	Staff findByPhone(@Param("phone") String phone);
}
