
class Employee {

    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

public class displayEmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Software Engineering", 85000.00);
        emp1.displayEmployeeDetails();
    }
}
