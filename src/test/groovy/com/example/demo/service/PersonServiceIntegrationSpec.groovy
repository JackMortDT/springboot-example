package com.example.demo.service

import com.example.demo.command.PersonCommand
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.TestPropertySource
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@Slf4j
@SpringBootTest
@ContextConfiguration
@TestPropertySource("classpath:application.properties")
class PersonServiceIntegrationSpec extends Specification {

  @Autowired
  PersonService personService

  @Transactional
  Void "Get people"() {
    when: "the method is executed"
      List<PersonCommand> people = personService.getPeople()
    then:
      assert people.size() > 0
  }

}
