package com.tcs.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.Repositories.StateEntityRepo;
import com.tcs.entity.StateEntity;
@Service
public class StateServiceImpl implements StateService{
	
	@Autowired
	private StateEntityRepo repo;

	@Override
	public Map<Integer, String> getAllStates(Integer countryId) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		List<StateEntity> states = repo.findAllByCountryId(countryId);

		states.forEach(entity -> {
			map.put(entity.getStateId(), entity.getStateName());
		});

		return map;
	}

}
