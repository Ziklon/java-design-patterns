package org.patterns.creational.fluent.graph;

public class EdgeBuilder {

  Edge edge;
  GraphBuilder graphBuilder;

  public EdgeBuilder(GraphBuilder graphBuilder) {
    this.graphBuilder = graphBuilder;
    edge = new Edge();
  }

  public EdgeBuilder from(String from) {
    Vertex vertex = new Vertex(from);
    edge.setFromVertex(vertex);
    graphBuilder.getGraph().addVertex(vertex);
    return this;
  }

  public EdgeBuilder to(String to) {
    Vertex vertex = new Vertex(to);
    edge.setToVertex(vertex);
    graphBuilder.getGraph().addVertex(vertex);
    return this;
  }

  public GraphBuilder weight(Double w) {
    edge.setWeight(w);
    return graphBuilder;
  }
}
