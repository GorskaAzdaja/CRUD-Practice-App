package com.contacts.repository;

import org.springframework.data.repository.CrudRepository;

import com.contacts.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
