package org.skypro.skyshop.model.product;

import java.util.UUID;

public class DiscountedProduct extends Product {

    private final int discount;

    public DiscountedProduct(UUID id, String name, int price, int discount) {
        super(name, id, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
