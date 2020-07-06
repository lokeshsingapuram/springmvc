package com.tcs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_DTLS")
public class ContactEntity {
	
	@Id
	@SequenceGenerator(name = "CONTACT_ID_SEQ",sequenceName = "CONTACT_ID_SEQ")
	@GeneratedValue(generator = "CONTACT_ID_SEQ",strategy = GenerationType.SEQUENCE)
	private Integer contactId;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_EMAIL")
	private String contactEmail;
	@Column(name = "CONTACT_PHNO")
	private Long contactPhoneNumber;
	@Column(name = "CREATED_DT", updatable = false)
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name = "UPDATED_DT",insertable = false)
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	private Date updatedDate;
	

}
