package com.blackscure.spring.api;

import com.blackscure.spring.model.Person;
import com.blackscure.spring.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
