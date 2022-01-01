package org.patterns.creational.fluent.sqlconnection.stages;

public interface UserSelectionStage {
  PasswordSelectionStage asUser(String user);
}
