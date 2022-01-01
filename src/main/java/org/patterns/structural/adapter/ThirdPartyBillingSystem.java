package org.patterns.structural.adapter;

import java.util.List;

public class ThirdPartyBillingSystem {


  /**
   * processSalary will paid to the employees according their position.
   *
   * @param employeeList to process their salary
   */
  public void processSalary(List<Employee> employeeList) {
    for (Employee employee : employeeList) {
      System.out.print("\n" + employee.toString() + " : ");
      if (employee.getPosition() == Position.TEAM_LEADER) {
        System.out.println("70000Rs Salary credited to " + employee.getName() + " Account\n");
      } else if (employee.getPosition() == Position.DEVELOPER) {
        System.out.println("40000Rs Salary credited to " + employee.getName() + " Account\n");
      } else if (employee.getPosition() == Position.TESTER) {
        System.out.println("30000Rs Salary credited to " + employee.getName() + " Account\n");
      }
    }
  }

}
