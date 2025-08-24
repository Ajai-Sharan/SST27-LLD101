package SOLID.ex01.srcAnswer;
public class SmtpOrderRepository implements OrderRepository {
    @Override
    public void saveOrder(double total) {
         System.out.println("Order stored with total: " + total);
    }
}
