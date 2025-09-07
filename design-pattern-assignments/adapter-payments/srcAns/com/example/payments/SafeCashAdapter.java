import com.example.payments.PaymentGateway;
import com.example.payments.SafeCashClient;

public class SafeCashAdapter implements PaymentGateway{

    private final SafeCashClient safeCashClient;

    public SafeCashAdapter(SafeCashClient safeCashClient){
        this.safeCashClient = safeCashClient;
    }

    public String charge(String customerId, int amountCents){
        
        return this.safeCashClient.createPayment(amountCents, customerId).confirm();
    }
}
