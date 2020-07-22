package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CITY_MASTER")
public class CityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer cityId;
	private Integer stateId;
	private String cityName;
	
	
}
