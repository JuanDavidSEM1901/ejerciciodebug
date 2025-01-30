package com.devsenior.jruizped;

public class Product {
    private String name;
    private Integer stock;
    private Double price;


    public Product(String name, Integer stock, Double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    public Integer getStock() {
        return stock;
    }


    public Double getPrice() {
        return price;
    }


    public void setStock(Integer stock) {
        this.stock = stock;
        
    }

    

    

    
}
