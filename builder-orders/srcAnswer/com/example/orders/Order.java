package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    final private String id;
    final private String customerEmail;
    final private List<OrderLine> lines;
    final private Integer discountPercent; // 0..100 expected, but not enforced
    final private boolean expedited;
    final private String notes;

    private Order(Builder b){
        this.id = b.id;
        this.customerEmail = b.id;
        this.lines = List.copyOf(b.lines);
        this.discountPercent = b.discountPercent;
        this.expedited = b.expedited;
        this.notes = b.notes;
    }

    public static class Builder {
    private String id = "";
    private String customerEmail = "";
    private final List<OrderLine> lines = new ArrayList<>();
    private Integer discountPercent = 0; 
    private boolean expedited = false;
    private String notes = "";

    public Builder setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id must not be blank");
        }
        this.id = id;
        return this;
    }

    public Builder setCustomerEmail(String customerEmail) {
        if (!PricingRules.isValidEmail(customerEmail)) {
            throw new IllegalArgumentException("invalid customer email");
        }
        this.customerEmail = customerEmail;
        return this;
    }

    public Builder addLine(OrderLine line) {
        if (line == null) {
            throw new IllegalArgumentException("order line must not be null");
        }
        lines.add(line);
        return this;
    }

    public Builder addlines(List<OrderLine> lines){
        for (OrderLine line : lines){
            if (line == null) {
            throw new IllegalArgumentException("order line must not be null");
            }
            lines.add(line);
        }

        return this;
    }

    public Builder setDiscountPercent(Integer discountPercent) {
        if (!PricingRules.isValidDiscount(discountPercent)) {
            throw new IllegalArgumentException("discount must be between 0 and 100");
        }
        this.discountPercent = discountPercent;
        return this;
    }

    public Builder setExpedited(boolean expedited) {
        this.expedited = expedited;
        return this;
    }

    public Builder setNotes(String notes) {
        this.notes = notes != null ? notes : "";
        return this;
    }

    public Order build() {
        // final validation
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("id must not be blank");
        }
        if (!PricingRules.isValidEmail(customerEmail)) {
            throw new IllegalArgumentException("invalid customer email");
        }
        if (!PricingRules.isValidDiscount(discountPercent)) {
            throw new IllegalArgumentException("discount must be between 0 and 100");
        }
        if (lines.isEmpty()) {
            throw new IllegalArgumentException("order must have at least one line");
        }

        return new Order(this);
    }
}

    public String getId() {
        return id;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public List<OrderLine> getLines() {
        return lines;
    } // leaks internal list

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public boolean isExpedited() {
        return expedited;
    }

    public String getNotes() {
        return notes;
    }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines)
            sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null)
            return base;
        return base - (base * discountPercent / 100);
    }
}
