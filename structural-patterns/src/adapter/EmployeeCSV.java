package adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeCSV(String csvString) {
        StringTokenizer stringTokenizer = new StringTokenizer(csvString, ",");
        if (stringTokenizer.hasMoreElements()) {
            id = Integer.parseInt(stringTokenizer.nextToken());
        }
        if (stringTokenizer.hasMoreElements()) {
            firstName = stringTokenizer.nextToken();
        }

        if (stringTokenizer.hasMoreElements()) {
            lastName = stringTokenizer.nextToken();
        }

        if (stringTokenizer.hasMoreElements()) {
            email = stringTokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeCSV{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
