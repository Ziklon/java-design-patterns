package org.patterns.creational.builder.car;

import org.junit.Assert;
import org.junit.Test;

public class CarTest {

  @Test
  public void testBuild() {
    int wheels = 4;
    String color = "Red";
    Car car = Car.builder()
            .color(color)
            .wheels(wheels)
            .size(Size.SMALL)
            .build();
    Assert.assertEquals(color, car.getColor());
    Assert.assertEquals(Size.SMALL, car.getSize());
    Assert.assertEquals(wheels, car.getWheels());
  }
}
