package com.tcs.Repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.RegistrationEntity;

@Repository
public interface RegistrationEntityRepo extends JpaRepository<RegistrationEntity, Serializable> {
	
	public RegistrationEntity findByEmail(String email);

}
