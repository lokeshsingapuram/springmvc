package com.tcs.Repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.CountryEntity;

public interface CountryEntityRepo extends JpaRepository<CountryEntity,	Serializable>{

}
