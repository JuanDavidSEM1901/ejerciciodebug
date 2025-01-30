package com.devsenior.jruizped;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Product> products;

    public Inventario() {
        products = new ArrayList<>();

    }

    public void addProduct(Product product) {

        try {
            if (getProductByName(product.getName()) != null) {
                throw new ErrorAlCrearElProductoException("El producto ya existe");
            }
            System.out.println("El producto se ha creado correctamente");
            this.products.add(product);
        } catch (ErrorAlCrearElProductoException e) {
            System.out.println(e.getMessage());
        }

    }

    public void sellProduct(String name, Integer quantity) {

        Product product = getProductByName(name);

        if (product == null) {
            System.out.println("El producto no existe");
            return;
        }

        try {
            if (product.getStock() < quantity) {
                throw new StockInsuficienteException("El stock es insuficiente");
            }

            product.setStock(product.getStock() - quantity);
            System.out.println("El producto se ha vendido correctamente");
        } catch (StockInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        
    }

    public Double calculateTotalInventary() {
        var total = 0d;

        for (Product product : products) {
            total += product.getStock() * product.getPrice();
        }

        return total;
    }

    private Product getProductByName(String name) {
        

        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;

            }

        }
        
        return null;

    }
}
