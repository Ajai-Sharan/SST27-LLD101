package SOLID.ex01.srcAnswer;
public class OrderService {
    private OrderCalculator calculator;
    private EmailService emailService;
    private OrderRepository repository;

    public OrderService(OrderCalculator calculator, EmailService emailService, OrderRepository repository) {
        this.calculator = calculator;
        this.emailService = emailService;
        this.repository = repository;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = calculator.totalWithTax(subtotal);
        repository.saveOrder(total);
        emailService.send(customerEmail, "Thanks! Your total is " + total);
    }
}
