package com.devsenior.jruizped;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Product> products;

    public Inventario(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void sellProduct(String name, Integer quantity){
        // producto existente
        var product = getProductByName(name);

        // hay cantidad suficiente
        if (product.getStock() < quantity){
            // no hay cantidad suficiente
        }

        product.setStock(product.getStock() - quantity);
    }

    public Double calculateTotalInventary(){
        var total = 0d;

        for (Product product : products){
            total += product.getStock() * product.getPrice();
        }

        return total;
    }

    private Product getProductByName(String name){
        for (Product product : products){
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    
}
