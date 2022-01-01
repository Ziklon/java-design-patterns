package org.patterns.creational.fluent.graph;

import lombok.Getter;

public class GraphBuilder {

  @Getter
  private final Graph graph;

  public GraphBuilder() {
    graph = new Graph();
  }


  public static GraphBuilder graph() {
    return new GraphBuilder();
  }

  public EdgeBuilder edge() {
    EdgeBuilder builder = new EdgeBuilder(this);
    graph.addEdge(builder.edge);
    return builder;
  }

  public void printGraph() {
    Graph.printGraph(graph);
  }
}
