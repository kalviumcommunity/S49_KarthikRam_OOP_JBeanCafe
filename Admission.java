import java.util.ArrayList;
import java.util.List;

public class Admission {
    private List<Employee> employees;
    private List<Customer> customers;
    private static String password = "$1234";

    public Admission() {
        this.employees = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayEmployees() {
        System.out.println("Employees:");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }
    }

    public void displayCustomers() {
        System.out.println("Customers:");
        for (Customer cust : customers) {
            cust.displayInfo();
            System.out.println();
        }
    }

    public static String getPassword(){
        return password;
    }
}