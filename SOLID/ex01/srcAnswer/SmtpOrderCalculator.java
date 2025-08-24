package SOLID.ex01.srcAnswer;
public class SmtpOrderCalculator implements OrderCalculator{
    double taxRate = 0.18;

    @Override
    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
