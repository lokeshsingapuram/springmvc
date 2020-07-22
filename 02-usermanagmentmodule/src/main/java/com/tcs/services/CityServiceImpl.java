package com.tcs.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Repositories.CityEntityRepo;
import com.tcs.entity.CityEntity;
@Service
public class CityServiceImpl  implements CityService{
	
	@Autowired
	private CityEntityRepo repo;

	@Override
	public Map<Integer, String> getAllCitiesByStateId(Integer stateId) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<CityEntity> cities = repo. findAllByStateId(stateId);

		cities.forEach(entity -> {
			map.put(entity.getCityId(), entity.getCityName());
		});

		return map;
	}

}
