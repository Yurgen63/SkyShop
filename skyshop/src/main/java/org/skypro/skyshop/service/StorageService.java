package org.skypro.skyshop.service;

import org.skypro.skyshop.model.article.Article;
import org.skypro.skyshop.model.product.DiscountedProduct;
import org.skypro.skyshop.model.product.FixPriceProduct;
import org.skypro.skyshop.model.product.Product;
import org.skypro.skyshop.model.product.SimpleProduct;
import org.skypro.skyshop.model.search.Searchable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StorageService {
    private final Map<UUID, Product> products;
    private final Map<UUID, Article> articles;

    public StorageService() {
        this.products = new HashMap<>();
        this.articles = new HashMap<>();
        initTestData();
    }

    private void initTestData() {
        SimpleProduct product1 = new SimpleProduct(UUID.randomUUID(), "Молоко", 50);
        DiscountedProduct product2 = new DiscountedProduct(UUID.randomUUID(), "Простокваша", 40, 30);
        FixPriceProduct product3 = new FixPriceProduct(UUID.randomUUID(), "Айран");

        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);

        Article article1 = new Article(UUID.randomUUID(),
                "Молоко",
                "Полезный напиток, ценный пищевой продукт, содержащий более 100 питательных веществ, включая белки, жир, молочный сахар, минеральные вещества ");

        Article article2 = new Article(UUID.randomUUID(),
                "Простокваша",
                "Кисломолочный продукт, образующийся из молока в результате кисломолочного брожения. ");

        Article article3 = new Article(UUID.randomUUID(),
                "Айран",
                "Кисломолочный напиток на основе тураха, катыка или разновидность кефира. "
        );

        articles.put(article1.getId(), article1);
        articles.put(article2.getId(), article2);
        articles.put(article3.getId(), article3);
    }

    public Collection<Product> getAllProducts() {
        return products.values();
    }

    public Collection<Article> getAllArticles() {
        return articles.values();
    }

    public Collection<Searchable> getAllSearchable() {
        Collection<Searchable> result = new ArrayList<>();
        result.addAll(products.values());
        result.addAll(articles.values());
        return result;
    }
    public Optional<Product> getProductById(UUID id) {
        return Optional.ofNullable(products.get(id));
    }
}
