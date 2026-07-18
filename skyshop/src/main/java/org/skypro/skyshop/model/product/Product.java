package org.skypro.skyshop.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public abstract class Product implements Searchable {
    private final String name;
    private final UUID id;
    private final int price;

    public Product(String name, UUID id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    @JsonIgnore
    public String getSearchTerm() {
        return getName();
    }

    @Override
    @JsonIgnore
    public String getContentType() {
        return "PRODUCT";
    }

    public abstract boolean isSpecial();
}