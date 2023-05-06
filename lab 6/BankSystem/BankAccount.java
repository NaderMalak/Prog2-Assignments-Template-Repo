// Nader Malak
// 20206467
package BankSystem;

public final class BankAccount {
    private double balance;

    public double getBalance() {
        return balance * 1.1;
    }

    public void setBalance(double b) {
        if (b > 0 && b < 1000000) {
            this.balance += b;
            System.out.println("Balance set to " + this.balance + "$ with " + b + " amount put");
        } else System.out.println("Incorrect input!");
    }

    public void setBalance(double b, int tax) {
        if (b > 0 && b < 1000000) {
            this.balance += b - (b * tax / 100);
            System.out.println("Balance set to " + this.balance + "$ with " + b + " amount put at " + tax + "% tax.");
        } else System.out.println("Incorrect input!");
    }
}
