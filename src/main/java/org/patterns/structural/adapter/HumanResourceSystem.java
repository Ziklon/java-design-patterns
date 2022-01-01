package org.patterns.structural.adapter;

public class HumanResourceSystem {

  /**
   * getEmployees faker data.
   *
   * @return employees table as matrix[][]
   */
  public static String[][] getEmployees() {
    String[][] employees = new String[4][];
    employees[0] = new String[]{"100", "Dave", "Team Leader"};
    employees[1] = new String[]{"101", "Ram", "Developer"};
    employees[2] = new String[]{"102", "Raj", "Developer"};
    employees[3] = new String[]{"103", "Rahul", "Tester"};
    return employees;
  }

  /**
   * main method.
   *
   * @param args - initial arguments for the client
   */

  public static void main(String[] args) {

    PaymentSalary payment = new EmployeeAdapter();
    System.out.println("HR system passes employee string array to Adapter\n");
    payment.processCompanySalary(getEmployees());
  }
}
