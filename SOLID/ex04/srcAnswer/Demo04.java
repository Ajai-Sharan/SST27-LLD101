
public class Demo04 {
    public static void main(String[] args) {
       Payment payment = new Payment(499);

       PaymentService upiPaymentService = new UpiPaymentService();

       System.out.println(upiPaymentService.pay(payment));
}
}