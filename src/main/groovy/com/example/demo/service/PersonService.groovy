package com.example.demo.service

import com.example.demo.command.Person

@Service
class PersonService {

  List<Person> getPeople() {
    [new Person(name:"Luis", lastName:"Sastré" , age:24 ),
     new Person(name:"Angel", lastName: "Hernandez", age: 27),
     new Person(name:"Victor", lastName: "Kurosaki", age: 26)
    ]
  }

}
