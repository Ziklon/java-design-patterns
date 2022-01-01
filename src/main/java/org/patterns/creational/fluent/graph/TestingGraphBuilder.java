package org.patterns.creational.fluent.graph;

public class TestingGraphBuilder {

  public static void main(String[] args) {
    Graph.graph().edge()
            .from("a")
            .to("b")
            .weight(40.0)
            .edge()
            .from("b")
            .to("c")
            .weight(20.0)
            .edge()
            .to("e")
            .from("d")
            .weight(50.0)
            .printGraph();

  }
}
