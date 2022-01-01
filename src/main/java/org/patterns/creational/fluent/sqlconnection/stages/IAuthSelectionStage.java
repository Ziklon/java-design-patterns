package org.patterns.creational.fluent.sqlconnection.stages;

import org.patterns.creational.fluent.sqlconnection.Authentication;

public interface IAuthSelectionStage {
  IConnectionInitializerStage withAuth(Authentication authentication);
}
