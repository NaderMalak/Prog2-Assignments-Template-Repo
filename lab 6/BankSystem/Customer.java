// Nader Malak
// 20206467
package BankSystem;

public class Customer extends Human {
    private String SSN;
    private String address;
    private BankAccount bankAcc;

    public Customer(String n, int a, char g, String s, String ad) {
        super(n, a, g);
        this.SSN = s;
        this.address = ad;
        this.bankAcc = new BankAccount();
    }
}
