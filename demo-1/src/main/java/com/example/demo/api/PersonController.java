package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.services.PersonService;
@RestController
public class PersonController {
	private final PersonService personService;
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	} 
	public void addPerson(Person person) {
		personService.addPerson(person);
	}
	

}
