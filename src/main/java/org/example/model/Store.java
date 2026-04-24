package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale chocolate = new Chocolate("Snack",50,"Chocolate");
        ProductForSale coke = new Coke("Drink",75,"Coke");
        ProductForSale bread = new Bread("Dough",20,"Bread");

        ProductForSale[] products = {chocolate,coke,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }
}