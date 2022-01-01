package org.patterns.creational.fluent.sqlconnection.stages;

public interface IServerSelectionStage {
  IDatabaseSelectionStage forSever(String server);
}
