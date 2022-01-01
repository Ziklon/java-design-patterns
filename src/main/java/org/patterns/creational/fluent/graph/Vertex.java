package org.patterns.creational.fluent.graph;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;

@AllArgsConstructor
@ToString
@Value
public class Vertex implements Comparable<Vertex> {
  private String label;

  @Override
  public int compareTo(Vertex o) {
    return Objects.compare(label, o.label, String::compareTo);
  }
}
