package com.example.demo.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id
  String name
  String lastName
  Integer age

}