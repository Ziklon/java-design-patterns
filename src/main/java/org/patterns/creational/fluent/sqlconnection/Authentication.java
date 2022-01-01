package org.patterns.creational.fluent.sqlconnection;

import lombok.Getter;
import lombok.ToString;
import org.patterns.creational.fluent.sqlconnection.stages.BuilderSelectionStage;
import org.patterns.creational.fluent.sqlconnection.stages.PasswordSelectionStage;
import org.patterns.creational.fluent.sqlconnection.stages.UserSelectionStage;

@ToString
public class Authentication implements
        UserSelectionStage,
        PasswordSelectionStage,
        BuilderSelectionStage {

  @Getter
  private String userName;
  @Getter
  private String password;

  private Authentication(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  private Authentication() {

  }

  public static UserSelectionStage createUser() {
    return new Authentication();
  }

  public PasswordSelectionStage asUser(String user) {
    this.userName = user;
    return this;
  }

  public Authentication withPassword(String password) {
    this.password = password;
    return this;
  }

  public Authentication build() {
    return new Authentication(userName, password);
  }
}


