package org.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements PaymentSalary {

  private ThirdPartyBillingSystem thirdPartyBillingSystem;

  public EmployeeAdapter() {
    this.thirdPartyBillingSystem = new ThirdPartyBillingSystem();
  }


  @Override
  public void processCompanySalary(String[][] employeeInfo) {



    List<Employee> employeeList = new ArrayList<Employee>();

    for (String[] row : employeeInfo) {
      Position position = Position.fromDesc(row[2]);
      employeeList.add(new Employee(Long.parseLong(row[0]), row[1], position));
    }

    System.out.println(
        "Adapter converted Array of Employee to ArrayList of Employee : \n" + employeeList + "\n"
            + "then delegate to the ThirdPartyBillingSystem for processing the employee salary");
    thirdPartyBillingSystem.processSalary(employeeList);

  }

}
