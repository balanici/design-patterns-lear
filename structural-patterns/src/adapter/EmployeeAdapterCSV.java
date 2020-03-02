package adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }


    @Override
    public String getId() {
        return String.valueOf(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstName();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastName();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmail();
    }

    @Override
    public String toString() {
        return "EmployeeAdapterCSV{" +
                "employeeCSV=" + employeeCSV +
                '}';
    }
}
