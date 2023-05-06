//Nader Malak
// 20206467
public class BankAccount {
    private double balance;
    private String username;
    private String bankName;
    private final String country = "Egypt";
    private int numOfUsers;
    private int numOfCalls;

    public BankAccount() {
        this.balance = 0;
        this.username = "Empty";
        this.bankName = "Empty";
        this.numOfUsers = 1;
        this.numOfCalls = 0;
        System.out.println("Balance initialised with 0$!\n");
    }
    public BankAccount(double b, String name, String bank) {
        this.balance = b;
        this.bankName = bank;
        this.username = name;
        this.numOfUsers = 1;
        this.numOfCalls = 0;
        System.out.println("Balance initialised with " + b + "$!\n");
    }
    public void deposit(double amount) {
        this.balance += amount;
        this.numOfCalls++;
        System.out.println("Deposited " + amount + "$ in the account!");
        System.out.println("Your balance is : " + this.balance + "$.");
        System.out.println(this.numOfUsers + " user/s called the functions in the system " + this.numOfCalls + " time/s\n");
    }
    public void withdraw(double amount) {
        this.balance -= amount;
        this.numOfCalls++;
        System.out.println("Withdrew " + amount + "$ in the account!");
        System.out.println("Your balance is : " + this.balance + "$.");
        System.out.println(this.numOfUsers + " user/s called the functions in the system " + this.numOfCalls + " time/s\n");
    }
}
