package com.example.demo.command

import com.example.demo.domain.Person

class PersonCommand {

  String name
  String lastName
  Integer age
  String fullName

  static PersonCommand toPersonCommand(Person person) {
    new PersonCommand(
      name: person.name,
      lastName: person.lastName,
      age: person.age,
      fullName: "${person.name} ${person.lastName}"
    )
  }

}