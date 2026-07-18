package org.skypro.skyshop.model.product;

import java.util.UUID;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 100;

    public FixPriceProduct(UUID id, String name) {
        super(name, id, FIXED_PRICE);
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
