package org.patterns.creational.fluent.sqlconnection.stages;

public interface IDatabaseSelectionStage {
  IAuthSelectionStage andDatabase(String database);
}
