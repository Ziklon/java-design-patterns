package org.patterns.structural.adapter;

public enum Position {
  TEAM_LEADER("Team Leader"), DEVELOPER("Developer"), TESTER("Tester");

  private final String desc;

  Position(String desc) {
    this.desc = desc;
  }

  /**
   * fromDesc return a Position Object from a description String.
   *
   * @param desc of the position
   * @return Position from a valid description
   */
  public static Position fromDesc(String desc) {

    for (Position position : Position.values()) {
      if (desc.equalsIgnoreCase(position.desc)) {
        return position;
      }
    }
    throw new RuntimeException(desc + " not found");
  }


}
