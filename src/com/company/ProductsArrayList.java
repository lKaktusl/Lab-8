package com.company;

import java.util.ArrayList;

public class ProductsArrayList {

    private ArrayList<Product> products = new ArrayList<>();

    public void addNewProductItem(Product productArrayList){
        this.products.add(productArrayList);
    }

    public void deleteProductWithIndicatedPrice (double price){
        int i = 0;
        int counterItems = 0;
        if(products.size() != 0) {
            while (i < products.size()) {
                if (products.get(i).getPrice() == price) {
                    products.remove(products.get(i));
                    counterItems++;
                } else
                    i++;
            }
        }
        else
            System.out.println("Список товаров не содержит никаких записей.");
        if(counterItems != 0)
            System.out.println("Удалено " + counterItems + " записей с ценой " + price + ".");
        else
            System.out.println("Не найдено ни одного товара с указанной ценой.");
    }

    public void showIndicatedProducts(String nameOfProduct) {
        int counterItems = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getNameOfProduct().equalsIgnoreCase(nameOfProduct)) {
                System.out.println("Искомый товар находится в магазине " + products.get(i).getShop() + " в количестве "
                        + products.get(i).getAmountOfProducts() + " штук.");
                counterItems++;
            }
        }
        if(counterItems == 0)
            System.out.println("Не найдено ни одной записи указанного товара.");
    }

    public void totalCostOfIndicatedProduct(String nameOfProduct){
        double totalCost = 0;
        int counterItems = 0;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getNameOfProduct().equalsIgnoreCase(nameOfProduct)) {
                totalCost += products.get(i).getTotal();
                counterItems++;
            }
        }
        if(counterItems != 0)
            System.out.println("Суммарная цена указанного товара во всех магазинах равна " + totalCost + ".");
        else
            System.out.println("Не найдено ни одной записи указанного товара.");
    }

    public void shopsWithChipestProduct(String nameOfProduct){
        double chipestPrice = -1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getNameOfProduct().equalsIgnoreCase(nameOfProduct)){
                while (chipestPrice == -1){
                    chipestPrice = products.get(i).getPrice();
                }
                if(products.get(i).getPrice() < chipestPrice){
                    chipestPrice = products.get(i).getPrice();
                }
            }
        }
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getNameOfProduct().equalsIgnoreCase(nameOfProduct) && (products.get(i).getPrice() == chipestPrice))
                System.out.println("Указанный товар самый дешевый в магазине " + products.get(i).getShop() + " по адресу " + products.get(i).getAddress() + ".");
        }
    }

    public void showProductArrayList(){
        if(products.size() != 0) {
            for (Product product : products) {
                System.out.println(product);
            }
        }
        else
            System.out.println("Список товаров пуст.");
    }
}