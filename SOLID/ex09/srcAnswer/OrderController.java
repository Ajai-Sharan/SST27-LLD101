public class OrderController {

    OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    void create(String id){
        orderRepository.save(id);
        orderRepository.show(id);
    }
}