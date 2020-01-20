public class MementoDemo {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee("Igor", "Home", "1111");
        System.out.println("Employee before save: " + employee);
        caretaker.save(employee);

        employee.setPhone("222");
        caretaker.save(employee);
        System.out.println("Employee after changed phone number state: " + employee);

        employee.setPhone("333");
        caretaker.revert(employee);
        System.out.println("Reverts to last save point: " + employee);

        caretaker.revert(employee);
        System.out.println("Revert to original: " + employee);

        caretaker.revert(employee);
    }
}
