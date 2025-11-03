package module07._5this;

public class Pay {
    private double pay;

    public Pay(double p) {
        this.pay = p;
    }

    public double getPay() {
        return this.pay;
    }

    public void calculatePayWithOvertime() {
        // this Pay object is passed to the Overtime constructor
        Overtime ot = new Overtime(this);
        this.pay = ot.getOvertimePay();
    }

    public static void main(String[] args) {
        Pay myPay = new Pay(100.0);
        myPay.calculatePayWithOvertime();
        System.out.println(myPay.getPay());
    }
}
