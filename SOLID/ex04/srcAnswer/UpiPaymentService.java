public class UpiPaymentService implements PaymentService {

    @Override
    public String pay(Payment p) {
        return "Paid via UPI: " + p.amount;
    }
    
}
