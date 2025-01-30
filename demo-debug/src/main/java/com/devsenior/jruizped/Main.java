package com.devsenior.jruizped;

public class Main {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        inventario.addProduct(new Product("Laptop", 10, 3000.0));
        inventario.addProduct(new Product("Iphone", 0, 5000.0));
        inventario.addProduct(new Product("Laptop", 5, 3000.0));

        inventario.sellProduct("Laptop", 5);
        inventario.sellProduct("Iphone", 1);
        inventario.sellProduct("Tablet", 2);

        System.out.println("Valor total del inventario: " + inventario.calculateTotalInventary());
    }
}