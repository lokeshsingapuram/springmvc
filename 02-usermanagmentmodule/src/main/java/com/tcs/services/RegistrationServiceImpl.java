package com.tcs.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Repositories.RegistrationEntityRepo;
import com.tcs.constants.AppConstants;
import com.tcs.entity.RegistrationEntity;
import com.tcs.model.Registration;
import com.tcs.utils.EmailUtils;
import com.tcs.utils.TemporaryPasswordUtils;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private RegistrationEntityRepo repo;
	@Autowired
	private TemporaryPasswordUtils pazzwd;
	@Autowired
	private EmailUtils emailUtils;

	@Override
	public String validateEmail(String email) {
		RegistrationEntity entity = repo.findByEmail(email);
		if (entity != null) {
			return "duplicate";
		}
		return "unique";
	}

	@Override
	public boolean saveUserDtls(Registration registration)  {
		String pwd = pazzwd.generatingRandomAlphabeticString();
		registration.setPwd(pwd);
		registration.setAccountStatus(AppConstants.AccStatus);
		RegistrationEntity entity = new RegistrationEntity();
		BeanUtils.copyProperties(registration, entity);
		RegistrationEntity entityStatus = repo.save(entity);
		if (entityStatus.getUserId() != null) {
			return emailUtils.sendUserAccUnlockEmail(registration);
		}
		return entityStatus.getUserId() != null;
	}

}
