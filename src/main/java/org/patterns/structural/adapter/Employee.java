package org.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
  private Long id;
  private String name;
  private Position position;
  
  
}
