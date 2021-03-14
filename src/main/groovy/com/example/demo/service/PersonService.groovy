package com.example.demo.service

import com.example.demo.domain.Person
import com.example.demo.repository.PersonRepository
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import com.example.demo.command.PersonCommand

@Slf4j
@Service
class PersonService {

  @Autowired
  PersonRepository personRepository

  @Transactional(readOnly = true)
  List<PersonCommand> getPeople() {
    List<Person> people = personRepository.findAll()
    people.collect() { person ->
      PersonCommand.toPersonCommand(person)
    }
  }

}
