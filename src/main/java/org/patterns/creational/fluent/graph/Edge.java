package org.patterns.creational.fluent.graph;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Edge {
  private Vertex fromVertex;
  private Vertex toVertex;
  private Double weight;
}
