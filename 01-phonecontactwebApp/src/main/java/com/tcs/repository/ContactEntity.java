package com.tcs.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class ContactEntity {
	
	@Id
	@SequenceGenerator(name = "CONTACT_ID_SEQ",sequenceName = "CONTACT_ID_SEQ")
	@GeneratedValue(generator = "CONTACT_ID_SEQ",strategy = GenerationType.SEQUENCE)
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "CREATED_DT")
	private Date createdDate;
	@Column(name = "UPDATED_DT")
	private Date updatedDate;
	

}
