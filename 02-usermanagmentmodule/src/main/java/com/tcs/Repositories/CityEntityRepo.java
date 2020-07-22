package com.tcs.Repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.CityEntity;

public interface CityEntityRepo extends JpaRepository<CityEntity, Serializable>{
	public List<CityEntity> findAllByStateId(Integer stateId);

}
