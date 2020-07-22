package com.tcs.services;

import java.util.Map;

public interface CityService {
	
	public Map<Integer, String> getAllCitiesByStateId(Integer stateId);

}
