package org.patterns.creational.fluent.sqlconnection;

public class TestFluentPattern {

  public static void main(String[] args) {
    DBConnection connection = FluentSqlConnection.createConnection()
            .forSever("localhost")
            .andDatabase("mysql")
            .withAuth(Authentication.createUser()
                    .asUser("root")
                    .withPassword("123")
                    .build())
            .connect();

    System.out.println(connection);
  }

}
