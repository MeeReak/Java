package Bridge;

public class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public String getPaymentInfo(Effection effection) {
        return effection.getText(amount);
    }
}
