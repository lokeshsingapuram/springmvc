package com.tcs.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Repositories.CountryEntityRepo;
import com.tcs.entity.CountryEntity;

@Service
public class CountryServiceImpl implements CountrySerivce {

	@Autowired
	private CountryEntityRepo repo;

	@Override
	public Map<Integer, String> getAllCountries() {
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<CountryEntity> countries = repo.findAll();

		countries.forEach(entity -> {
			map.put(entity.getCountryId(), entity.getCountryName());
		});

		return map;
	}

}
