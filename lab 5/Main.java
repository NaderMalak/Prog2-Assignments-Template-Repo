public class Main {
    public static void main(String[] args) {
        BankAccount object1 = new BankAccount();
        object1.deposit(15648);
        object1.withdraw(1265);
        BankAccount object2 = new BankAccount(1000, "Nader", "Bank of Egypt");
        object2.deposit(153);
        object2.withdraw(598);
    }
}