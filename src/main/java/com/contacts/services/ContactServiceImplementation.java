package com.contacts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.contacts.model.Contact;
import com.contacts.repository.ContactRepository;

@Service
@Transactional
public class ContactServiceImplementation implements ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	@Override
	public List<Contact> getAllContacts() {
		return (List<Contact>) contactRepository.findAll();
	}

	@Override
	public Contact getContactById(int customer_id) {
		return contactRepository.findById(customer_id).get();
	}

	@Override
	public void addContact(Contact contact) {
		contactRepository.save(contact);
	}

	@Override
	public void deleteContact(int customer_id) {
		contactRepository.deleteById(customer_id);
	}
}
