package store;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public Product findByName(String name){
        //TODO: check demetra law
        return products.stream().filter(product -> product.getName().equals(name)).findFirst().orElseThrow(() -> new IllegalArgumentException("There is no such product -> " + name));
    }

    public double calculateTotalCost(String query) {
        char[] index = query.trim().toCharArray();
        double result = 0.0;
        for (char c : index) {
            Product product = findByName(String.valueOf(c));
            result += product.getPrice();
        }

        return result;
    }
}
