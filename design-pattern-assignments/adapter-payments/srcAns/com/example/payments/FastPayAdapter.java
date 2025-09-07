import srcAns.com.example.payments.FastPayClient;
import SrcAns.com.example.payments.PaymentGateway;

public class FastPayAdapter implements PaymentGateway{

    private final FastPayClient fastPayClient;

    public FastPayAdapter(FastPayClient fastPayClient){
        this.fastPayClient = fastPayClient;
    }

    public String charge(String customerId, int amountCents){
        
        return this.fastPayClient.payNow(customerId, amountCents);

    }
    
}
