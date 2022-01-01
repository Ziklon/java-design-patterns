package org.patterns.creational.fluent.sqlconnection.stages;

import org.patterns.creational.fluent.sqlconnection.DBConnection;

public interface IConnectionInitializerStage {
  DBConnection connect();
}
