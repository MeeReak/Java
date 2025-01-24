import Bridge.Detail;
import Bridge.Discount;
import Bridge.Payment;
import Bridge.Short;

public class Main {
    public static void main(String[] args) {
        // Create a detail object
        Detail detail = new Detail();
        Short shortInfo = new Short();

        Discount detailDiscount = new Discount(0.1, true, detail);
        Discount shortDiscount = new Discount(0.1, true, shortInfo);

        Payment payment = new Payment(1000);
        System.out.println(payment.getPaymentInfo(shortDiscount));
        System.out.println(payment.getPaymentInfo(detailDiscount));
    }
}