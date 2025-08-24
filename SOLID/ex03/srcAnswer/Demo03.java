public class Demo03 {
    public static void main(String[] args) {
        ShippingCostCalculator shippingCostCalculator = new ExpressShippingCostCalculator();
        Shipment s = new Shipment(0);
        System.out.println(shippingCostCalculator.cost(s));
    }
}
