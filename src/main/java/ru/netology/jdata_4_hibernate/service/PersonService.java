package ru.netology.jdata_4_hibernate.service;

import org.springframework.stereotype.Service;

import ru.netology.jdata_4_hibernate.entity.Person;
import ru.netology.jdata_4_hibernate.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return personRepository.getPersonsByCity(city);
    }
}
