package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order o = new Order.Builder().setId(id).setCustomerEmail(email).setDiscountPercent(discount).addlines(lines).setExpedited(expedited).setNotes(notes).build();

        return o;
    }
}
