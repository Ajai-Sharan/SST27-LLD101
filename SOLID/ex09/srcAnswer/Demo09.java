public class Demo09 {

    public static void main(String[] args) {

        OrderRepository orderRepository = new SqlOrderRepository();

        OrderController orderController = new OrderController(orderRepository);

        orderController.create("ORD-1");
    }
}
