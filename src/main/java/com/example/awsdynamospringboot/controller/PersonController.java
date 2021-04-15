package com.example.awsdynamospringboot.controller;


import com.example.awsdynamospringboot.model.Person;
import com.example.awsdynamospringboot.postgresRepo.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping(path = "/person/{id}")
    public Person findPerson(@PathVariable Integer id) {
        log.info(" / person/id api hit");
        return personRepository.findById(id).get();
    }

    @GetMapping(path = "/person")
    public List<Person> findAllPerson() {
        log.info(" / person api hit");
        return personRepository.findAll();
    }
}
