package com.tcs.model;

import java.util.Date;

import lombok.Data;

@Data
public class Contact {
	
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Date createdDate;
	private Date updatedDate;

}
