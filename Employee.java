public class Employee extends Person {
    private String employeeId;
    private double salary;

    public Employee(String firstName, String lastName, String email, String phoneNumber, String employeeId, double salary) {
        super(firstName, lastName, email, phoneNumber);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // overriding the abstract method from the Person parent class.
    @Override
    public String getType() {
        return "Employee";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: Rs." + salary);
    }
}