package com.blackscure.spring.service;

import com.blackscure.spring.dao.PersonDao;
import com.blackscure.spring.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }
}
