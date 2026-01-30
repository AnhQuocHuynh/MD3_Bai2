package re.edu.service;

import re.edu.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "iPhone 15", 20000000));
        products.add(new Product(2, "MacBook M3", 35000000));
        products.add(new Product(3, "AirPods Pro", 5000000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

