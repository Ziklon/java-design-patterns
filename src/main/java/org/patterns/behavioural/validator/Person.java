package org.patterns.behavioural.validator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person {
  private String lastName;
  private String firstName;
  private int age;

  public Person(String lastName, Integer age) {
    this.lastName = lastName;
    this.age = age;
  }
}