package org.patterns.creational.builder.fluent.sqlconnection;

import org.junit.Assert;
import org.junit.Test;
import org.patterns.creational.fluent.sqlconnection.Authentication;
import org.patterns.creational.fluent.sqlconnection.DBConnection;
import org.patterns.creational.fluent.sqlconnection.FluentSqlConnection;

public class SqlConnectionTest {

  @Test
  public void testSqlConnectionBuild() {

    DBConnection connection = FluentSqlConnection.createConnection()
            .forSever("localhost")
            .andDatabase("mysql")
            .withAuth(Authentication.createUser()
                    .asUser("root")
                    .withPassword("123")
                    .build())
            .connect();

    Assert.assertEquals("root", connection.getAuthentication().getUserName());
    Assert.assertEquals("123", connection.getAuthentication().getPassword());
    Assert.assertEquals("mysql", connection.getDatabase());
  }
}
