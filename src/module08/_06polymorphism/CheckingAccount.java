package module08._06polymorphism;

public class CheckingAccount extends Account {
    private double overdraftFee;

    public CheckingAccount(String name, double balance) {
        super(name, balance);
        this.overdraftFee = 0;
    }

    // overdraft fees let u withdraw more than u have but charge a fee on it
    public void withDraw(double amount){
        if (amount > this.getBalance()){
            
        } else {
            this.setBalance(this.getBalance() - amount);
        }
    }
}
