package com.example.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Autowired
import com.example.demo.command.Person
import com.example.demo.service.PersonService

@Controller
class HomeController {

  @Autowired
  PersonService personService

  @ResponseBody
  @RequestMapping("/list_people")
  List<Person> listPeople() {
    personService.getPeople()
  }

}
