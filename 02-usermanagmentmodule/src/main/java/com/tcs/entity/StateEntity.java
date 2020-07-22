package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STATE_MASTER")
@Data
public class StateEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer stateId;
	private Integer countryId;
	private String stateName;
	

}
