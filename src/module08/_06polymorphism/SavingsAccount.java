package module08._06polymorphism;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String name, double balance, double interestRate){
        super(name, balance);
        this.interestRate = interestRate;
    }

    public void compoundInterest(int numYears){
        super.setBalance(super.getBalance() * Math.pow(1 + interestRate, numYears));
    }

    public String toString(){
        return super.toString() + "\nInterest Rate: " + interestRate;
    }

}
