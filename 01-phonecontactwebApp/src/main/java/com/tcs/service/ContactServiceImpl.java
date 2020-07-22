package com.tcs.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.entity.ContactEntity;
import com.tcs.model.Contact;
import com.tcs.repository.ContactRepo;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public boolean saveContact(Contact contact) {

		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(contact, entity);
		ContactEntity save = contactRepo.save(entity);
		return save.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {

		List<ContactEntity> contacts = contactRepo.findAll();
		return contacts.stream().map(entity -> {
			Contact contact = new Contact();
			BeanUtils.copyProperties(entity, contact);
			return contact;
		}).collect(Collectors.toList());
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional<ContactEntity> contactById = contactRepo.findById(id);
		if (contactById.isPresent()) {
			contactById.get();
			Contact contact1 = new Contact();
			BeanUtils.copyProperties(contactById, contact1);
			return contact1;
		}

		return null;
	}

	@Override
	public boolean deleteContact(Integer id) {
		if(id!=null) {
		contactRepo.deleteById(id);
		return true;
		}
		return false;
	}

}
