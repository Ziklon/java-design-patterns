package org.patterns.behavioural.validator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ValidatorTest {

  @Test
  public void validator_1() {

    Validator<Person> validator =
            Validator.<Person>firstValidate(p -> p.getLastName() == null, "name is null")
                    .thenValidate(p -> p.getAge() < 0, "age is negative")
                    .thenValidate(p -> p.getAge() > 150, "age is greater than 150");

    Person person = new Person("Stuart", 25);
    assertThat(validator.validate(person).get()).isSameAs(person);
  }

  @Test
  public void validator_2() {

    Validator<Person> validator =
            Validator.<Person>firstValidate(p -> p.getLastName() == null, "name is null")
                    .thenValidate(p -> p.getAge() < 0, "age is negative")
                    .thenValidate(p -> p.getAge() > 150, "age is greater than 150");

    Person person = new Person(null, 25);
    assertThatExceptionOfType(Validator.ValidationException.class)
            .isThrownBy(() -> validator.validate(person).get());

    assertThatThrownBy(() -> validator.validate(person).get())
            .hasSuppressedException(new IllegalArgumentException("name is null"));
  }

  @Test
  public void validator_3() {

    Validator<Person> validator =
            Validator.<Person>firstValidate(p -> p.getLastName() == null, "name is null")
                    .thenValidate(p -> p.getAge() < 0, "age is negative")
                    .thenValidate(p -> p.getAge() > 150, "age is greater than 150");

    Person person = new Person(null, 180);
    assertThatExceptionOfType(Validator.ValidationException.class)
            .isThrownBy(() -> validator.validate(person).get());

    assertThatThrownBy(() -> validator.validate(person).get())
            .hasSuppressedException(new IllegalArgumentException("name is null"))
            .hasSuppressedException(new IllegalArgumentException("age is greater than 150"));
    System.out.println(validator);
  }

  @Test
  public void validator_4() {

    Validator<Person> validator =
            Validator.<Person>firstValidate(p -> p.getLastName() == null, "name is null")
                    .thenValidate(p -> p.getAge() < 0, "age is negative")
                    .thenValidate(p -> p.getAge() > 150, "age is greater than 150");

    Person person = new Person("Stuart", -10);
    assertThatExceptionOfType(Validator.ValidationException.class)
            .isThrownBy(() -> validator.validate(person).get());

    assertThatThrownBy(() -> validator.validate(person).get())
            .hasSuppressedException(new IllegalArgumentException("age is negative"));
  }
}
