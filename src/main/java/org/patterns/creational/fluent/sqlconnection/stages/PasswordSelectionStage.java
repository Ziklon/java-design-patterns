package org.patterns.creational.fluent.sqlconnection.stages;

public interface PasswordSelectionStage {
  BuilderSelectionStage withPassword(String password);
}
