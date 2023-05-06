// Nader Malak
// 20206467
package BankSystem;

public class Human {
    protected int age;
    protected String name;
    protected char gender;

    public Human(String n, int a, char g) {
        this.name = n;
        this.age = a;
        this.gender = g;
    }
    public void printData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
    }

    public final void greet() {
        System.out.println("Good Morning!");
    }
}
