package SOLID.ex01.srcAnswer;
public class Demo01 {
    public static void main(String[] args) {
        OrderCalculator calc = new SmtpOrderCalculator();
        EmailService email = new SmtpEmailClient();
        OrderRepository repo = new SmtpOrderRepository();

        OrderService service = new OrderService(calc, email, repo);
        service.checkout("a@shop.com", 100.0);
    }
}
