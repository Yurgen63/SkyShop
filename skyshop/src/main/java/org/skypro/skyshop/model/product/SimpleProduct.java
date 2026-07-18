package org.skypro.skyshop.model.product;

import java.util.UUID;

public class SimpleProduct extends Product {
    public SimpleProduct(UUID id, String name, int price) {
        super(name, id, price);
    }

    @Override
    public boolean isSpecial() {
        return false;
    }
}
