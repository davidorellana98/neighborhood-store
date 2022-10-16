package com.davidorellana;

import com.davidorellana.owner.StoreOwner;
import com.davidorellana.product.Category;
import com.davidorellana.product.PackagingDescription;
import com.davidorellana.product.ProductInformation;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Product 0 *****");
        PackagingDescription packagingDescriptionOne = new PackagingDescription("Bolsa", 11000.0, "ml");
        Category categoryOne = new Category("Lacteo/Huevos", true);
        ProductInformation productInformationOne = new ProductInformation(0L,"Leche Entera Apina", packagingDescriptionOne, categoryOne, "Leche", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg");
        StoreOwner storeOwner = new StoreOwner("Camila", "Ordoñez",35);
        String isCreatedProduct = storeOwner.createNewProduct(productInformationOne) ? "created" : "not created";
        System.out.println("Product " + productInformationOne.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id and name: " + storeOwner.findProductByNameAndId(0L, "Leche Entera Apina"));
        System.out.println("Product update: " + storeOwner.updateProductInformation(productInformationOne.getId(), new ProductInformation(0L,"Leche Alpina Entera", packagingDescriptionOne, categoryOne, "Leche POLVO", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg")));


        System.out.println("***** Product 1 *****");
        PackagingDescription packagingDescriptionTwo = new PackagingDescription("Caja", 1000.0, "ml");
        Category categoryTwo = new Category("Vinos y Licores", false);
        ProductInformation productInformationTwo = new ProductInformation(1L,"Aguardiente Antiqueño Verde", packagingDescriptionTwo, categoryTwo, "Aguardeinte", 45600.0, "https://metrocolombiafood.vteximg.com.br/arquivos/ids/259143-1000-1000/7702049001675.jpg?v=637172016121530000");
        isCreatedProduct = storeOwner.createNewProduct(productInformationTwo) ? "created" : "not created";
        System.out.println("Product " + productInformationTwo.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id and name: " + storeOwner.findProductByNameAndId(1L, "Aguardiente Antiqueño"));
        System.out.println("Product update: " + storeOwner.updateProductInformation(productInformationTwo.getId(), new ProductInformation(1L,"Vodka Smirnoff", packagingDescriptionTwo, categoryTwo, "Vodka", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg")));


        System.out.println("***** Product 2 *****");
        PackagingDescription packagingDescriptionThree = new PackagingDescription("Bolsa", 750.0, "ml");
        Category categoryThree = new Category("Vinos y Licores", false);
        ProductInformation productInformationThree = new ProductInformation(2L,"Whiskey Jack Daniels Honey", packagingDescriptionThree, categoryThree, "Vodka", 107700.0, "https://jumbocolombiafood.vteximg.com.br/arquivos/ids/179058-1000-1000/Jack-Honey-750.jpg?v=636124971865400000");
        isCreatedProduct = storeOwner.createNewProduct(productInformationThree) ? "created" : "not created";
        System.out.println("Product " + productInformationThree.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id and name: " + storeOwner.findProductByNameAndId(2L, "Whiskey Jack Daniels Honey"));

        System.out.println("***** Product query *****");
        System.out.println("Product query by category: " + storeOwner.queryProductWithSameCategory("Lacteo/Huevos"));

    }
}
