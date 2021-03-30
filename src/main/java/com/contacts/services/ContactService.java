package com.contacts.services;

import java.util.List;

import com.contacts.model.Contact;

public interface ContactService {
	
	
	public List<Contact> getAllContacts();
	
	public Contact getContactById(int customer_id);
	
	public void addContact(Contact contact);
	
	public void deleteContact(int customer_id);
	
	
}
