package org.patterns.creational.fluent.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
import lombok.Singular;

@Getter
public class Graph {
  @Singular
  private final List<Edge> edges;
  @Singular
  private final Set<Vertex> vertices;

  public Graph() {
    edges = new ArrayList<>();
    vertices = new TreeSet<>();
  }

  public static GraphBuilder graph() {
    return new GraphBuilder();
  }

  public static void printGraph(Graph g) {
    System.out.println("Vertices...");
    for (Vertex v : g.getVertices()) {
      System.out.print(v.getLabel() + " ");
    }
    System.out.println();
    System.out.println("Edges...");
    for (Edge e : g.getEdges()) {
      System.out.println(e);
    }
  }

  public void addEdge(Edge edge) {
    edges.add(edge);
  }

  public void addVertex(Vertex vertex) {
    vertices.add(vertex);
  }

}
