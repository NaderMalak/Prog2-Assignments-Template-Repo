// Nader Malak
// 20206467
package BankSystem;

public class Employee extends Human {
    private double salary;
    private String department;

    public Employee(String n, int a, char g, double s, String d) {
        super(n, a, g);
        this.salary = s;
        this.department = d;
    }

    @Override
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Salary: " + this.salary);
        System.out.println("Department: " + this.department);
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}
