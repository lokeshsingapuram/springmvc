package com.tcs.Repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.StateEntity;

public interface StateEntityRepo extends JpaRepository<StateEntity, Serializable> {

	public List<StateEntity> findAllByCountryId(Integer countryId);
}
