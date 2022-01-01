package org.patterns.creational.builder.car.test;

import org.junit.Assert;
import org.junit.Test;
import org.patterns.creational.builder.car.Car;
import org.patterns.creational.builder.car.Size;

public class CarTest {

  @Test
  public void testCarBuild() {
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
  
  @Test
  public void testCardWithMandatoryField() {
    Car car = Car.builder()
            .color("Blue")
            .build();

    Assert.assertNotNull(car);
    Assert.assertNull(car.getSize());
    Assert.assertEquals(0, car.getWheels());
    Assert.assertEquals("Blue", car.getColor());
  }
}
