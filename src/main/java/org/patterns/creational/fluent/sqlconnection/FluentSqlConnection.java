package org.patterns.creational.fluent.sqlconnection;

import org.patterns.creational.fluent.sqlconnection.stages.IAuthSelectionStage;
import org.patterns.creational.fluent.sqlconnection.stages.IConnectionInitializerStage;
import org.patterns.creational.fluent.sqlconnection.stages.IDatabaseSelectionStage;
import org.patterns.creational.fluent.sqlconnection.stages.IServerSelectionStage;

public class FluentSqlConnection implements
        IServerSelectionStage,
        IDatabaseSelectionStage,
        IAuthSelectionStage {
  private String server;
  private String database;
  private Authentication authentication;

  private FluentSqlConnection() {

  }

  public static IServerSelectionStage createConnection() {
    return new FluentSqlConnection();
  }

  public IDatabaseSelectionStage forSever(String server) {
    this.server = server;
    return this;
  }

  public IAuthSelectionStage andDatabase(String database) {
    this.database = database;
    return this;
  }

  @Override
  public IConnectionInitializerStage withAuth(Authentication authentication) {
    this.authentication = authentication;
    return () -> new DBConnection(server, database, authentication);
  }
}


