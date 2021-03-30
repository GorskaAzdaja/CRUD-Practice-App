package com.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.contacts.model.Contact;
import com.contacts.services.ContactService;

@Controller
@RequestMapping(value ="/controller")
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value ="/list", method = RequestMethod.GET)
	public ModelAndView list() {
		
		ModelAndView model = new ModelAndView("contact_list");
		List<Contact> contactList = contactService.getAllContacts();
		model.addObject("contactList", contactList);
		
		return model;
	}
	
	@RequestMapping(value ="/addContact/", method = RequestMethod.GET)
	public ModelAndView addContact() {
		
		ModelAndView model = new ModelAndView();
		Contact contact = new Contact();
		model.addObject("contactForm", contact);
		model.setViewName("contact_form");
		
		return model;
	}
	
	@RequestMapping(value ="/editContact/{customer_id}", method = RequestMethod.GET)
	public ModelAndView editContact(@PathVariable int customer_id) {
		
		ModelAndView model = new ModelAndView();
		
		Contact contact = contactService.getContactById(customer_id);
		model.addObject("contactForm", contact);
		model.setViewName("contact_form");
		
		return model;
	}
	
	@RequestMapping(value="/addContact", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("contactForm") Contact contact) {
		
		contactService.addContact(contact);
		return new ModelAndView("redirect:/contact/list");
	}
	
	@RequestMapping(value="/deleteContact/{customer_id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable("customer_id") int customer_id) {
		
		contactService.deleteContact(customer_id);
		return new ModelAndView("redirect:/contact/list");
	}
}
