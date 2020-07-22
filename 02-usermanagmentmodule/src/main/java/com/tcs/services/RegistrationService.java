package com.tcs.services;

import org.springframework.stereotype.Service;

import com.tcs.model.Registration;

@Service
public interface RegistrationService {

	public boolean saveUserDtls(Registration registration);
	public String validateEmail(String email);
}
