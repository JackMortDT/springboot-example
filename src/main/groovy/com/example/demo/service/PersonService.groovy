package com.example.demo.service

import com.example.demo.domain.Person
import com.example.demo.repository.PersonRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService {

  @Autowired
  PersonRepository personRepository

  List<Person> getPeople() {
    personRepository.findAll()
  }

}
