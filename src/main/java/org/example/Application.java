package org.example;

import org.example.entities.Product;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Product PS5=new Product("playstation","console",600);
        Product Iphone=new Product("Iphone","Smartphone",1200);
        Product pampers=new Product("pampers","baby",10);
        Product book=new Product("book","books",30);
        Product LegoStarwars=new Product("LegoStarwars","toys",80);
        Product dumbbells=new Product("dumbbells","fitness",70);
    }
}
