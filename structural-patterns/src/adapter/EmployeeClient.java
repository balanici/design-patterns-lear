package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.cc");
        employees.add(employeeFromDB);

        EmployeeLdap employeeLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        return employees;
    }
}
