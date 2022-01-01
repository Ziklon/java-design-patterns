package org.patterns.creational.fluent.sqlconnection;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class DBConnection {
  private String server;
  private String database;
  private Authentication authentication;

  public DBConnection(String server, String database, Authentication auth) {
    this.server = server;
    this.database = database;
    this.authentication = auth;
  }

  public DBConnection() {

  }
}
