package com.company;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Shopcountry", "Одесса,Пушкинская,1", "dweed23", "Хлопья", 30,
                1);

        Product product2 = new Product("bestmarket", "Одесса,Пушкинская,2", "dweed23", "Хлопья", 50,
                1);

        Product product3 = new Product("Shopcountry", "Одесса,Пушкинская,3", "dweed23", "Бублики", 30,
                5);

        Product product4 = new Product("Shopcountry", "Одесса,Пушкинская,4", "dweed23", "Хлопья", 30,
                1);

        Product product5 = new Product("Shopcountry", "Одесса,Пушкинская,5", "dweed23", "Хлопья", 30,
                1);


        ProductsArrayList productsArrayList = new ProductsArrayList();
//        productsArrayList.showProductArrayList();
        productsArrayList.addNewProductItem(product2);
        productsArrayList.addNewProductItem(product3);
        productsArrayList.addNewProductItem(product4);
        productsArrayList.addNewProductItem(product5);
        productsArrayList.addNewProductItem(product1);
        /*productsArrayList.showIndicatedProducts("Хлопья");
        System.out.println();
        System.out.println(productsArrayList.totalCostOfIndicatedProduct("Хлопья"));
        productsArrayList.deleteProductWithIndicatedPrice(5);*/
//        productsArrayList.showIndicatedProducts("Хлопья");

//        productsArrayList.shopsWithChipestProduct("хлопья");
        productsArrayList.deleteProductWithIndicatedPrice(5);
        productsArrayList.shopsWithChipestProduct("хлопья");
        productsArrayList.showIndicatedProducts("лопья");
        productsArrayList.totalCostOfIndicatedProduct("хлопья");
        productsArrayList.deleteProductWithIndicatedPrice(1);
        System.out.println();
        productsArrayList.showProductArrayList();
    }
}
