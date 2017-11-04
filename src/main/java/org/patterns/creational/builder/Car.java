package org.patterns.creational.builder;

import lombok.Data;

@Data
public class Car {

  private int wheels;
  private String color;
  private Size size;

  private Car(Builder builder) {
    this.color = builder.color;
    this.size = builder.size;
    this.wheels = builder.wheels;
  }

  public static class Builder {

    private int wheels;
    private String color;
    private Size size;
    
    /**
     * Builder Constructor.
     * @param color car
     */
    public Builder(String color) {

      if (color == null) {
        throw new IllegalArgumentException("color can't be null");
      }
      this.color = color;
    }

    public Builder wheels(int wheels) {
      this.wheels = wheels;
      return this;
    }

    public Builder size(Size size) {
      this.size = size;
      return this;
    }

    public Car build() {
      return new Car(this);
    }

  }

}
