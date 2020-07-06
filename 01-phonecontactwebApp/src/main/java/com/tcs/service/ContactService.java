package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.model.Contact;
@Service
public interface ContactService {
	
	public boolean saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer id);
	public boolean deleteContact(Integer id);
	

}
