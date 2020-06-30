package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.model.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	@Override
	public boolean saveContact(Contact contact) {
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		return null;
	}

	@Override
	public Contact getContactById(Integer id) {
		return null;
	}

	@Override
	public boolean updateContact(Integer id) {
		return false;
	}

	@Override
	public boolean deleteContact(Integer id) {
		return false;
	}

}
