// Nader Malak
// 20206467
import BankSystem.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Start of Human class ****");
        Human h = new Human("Nader", 35, 'F');
        h.greet();
        h.printData();
        System.out.println("**** End of Human class ****\n");

        System.out.println("**** Start of Employee class ****");
        Employee e = new Employee("Nader", 35, 'F', 100, "Business");
        e.greet();
        e.printData();
        System.out.println("department getter ==> " + e.getDepartment());
        System.out.println("salary getter ==> " + e.getSalary());
        System.out.println("**** End of Employee class ****\n");

        System.out.println("**** Start of BankAccount class ****");
        BankAccount b = new BankAccount();
        b.setBalance(150000,15);
        b.setBalance(125545);
        System.out.println("balance getter ==> " + b.getBalance());
        System.out.println("**** End of BankAccount class ****\n");

        System.out.println("**** Start of Customer class ****");
        Customer c = new Customer("Ezzat", 88, 'M', "456218945112", "12 xx st.");
        c.greet();
        c.printData();
        System.out.println("**** End of Customer class ****\n");
    }
}