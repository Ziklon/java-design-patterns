package org.patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {


  @Test
  public void testBuild() {

    int wheels = 4;
    String color = "Red";

    Car car = new Car.Builder(color).size(Size.SMALL).wheels(wheels).build();

    Assert.assertEquals(color, car.getColor());
    Assert.assertEquals(Size.SMALL, car.getSize());
    Assert.assertEquals(wheels, car.getWheels());
  }
}
