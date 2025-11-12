package module08._06polymorphism;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return "Name: " + this.name + "\nBalance: " + this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("balance too low");
        } else {
            this.balance -= amount;
        }
    }

    public String getName() {
        return name;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        // all of these can be initialized as Account [name] because of polymorphism
        Account a1 = new Account("John", 21.28);
        Account sa1 = new SavingsAccount("Abby", 203.76, 0.05);
        Account ca1 = new CheckingAccount("poop", 2304.1);
        System.out.println(a1);
        System.out.println(sa1);
        System.out.println(ca1.getBalance());
    }
}
