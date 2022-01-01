package org.patterns.creational.builder.car;

import java.util.Objects;

import lombok.Value;

@Value
public class Car {

  private int wheels;
  private String color;
  private Size size;

  private Car(Builder builder) {
    this.color = builder.color;
    this.size = builder.size;
    this.wheels = builder.wheels;
  }

  public static ColorSelectionStage builder() {
    return new Builder();
  }

  public static class Builder implements ColorSelectionStage {

    private int wheels;
    private String color;
    private Size size;

    /**
     * Builder Constructor.
     */
    private Builder() {

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

    @Override
    public Builder color(String color) {
      Objects.requireNonNull(color, "color can't be null");
      this.color = color;
      return this;
    }
  }

  public interface ColorSelectionStage {
    Car.Builder color(String color);
  }
}