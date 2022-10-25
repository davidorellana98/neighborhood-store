package com.davidorellana;

import com.davidorellana.owner.StoreOwner;
import com.davidorellana.product.Category;
import com.davidorellana.product.PackagingDescription;
import com.davidorellana.product.ProductInformation;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Product 0 *****");
        PackagingDescription packagingDescription = new PackagingDescription("Bolsa", 11000.0, "ml");
        Category category = new Category("Lacteo/Huevos", true);
        ProductInformation productInformation = new ProductInformation(0L,"Leche Entera Apina", packagingDescription, category, "Leche", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg");
        StoreOwner storeOwner = new StoreOwner("Camila", "Ordoñez",35);
        String isCreatedProduct = storeOwner.addProduct(productInformation) ? "created." : "not created.";
        System.out.println("Product " + productInformation.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id: " + storeOwner.findProductById(0L));
        System.out.println("Product search by name: " + storeOwner.findProductByName("Leche Entera Apina"));
        ProductInformation newProduct =  storeOwner.updateProductInformation(new ProductInformation(0L,"Leche Alpina Entera", packagingDescription, category, "Leche POLVO", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg"));
        System.out.println("Product update: " + newProduct);
        System.out.println("Product search by id: " + storeOwner.findProductById(0L));

        System.out.println("***** Product 1 *****");
        PackagingDescription packagingDescriptionOne = new PackagingDescription("Caja", 1000.0, "ml");
        Category categoryOne = new Category("Vinos y Licores", false);
        ProductInformation productInformationOne = new ProductInformation(1L,"Aguardiente Antiqueño Verde", packagingDescriptionOne, categoryOne, "Aguardeinte", 45600.0, "https://metrocolombiafood.vteximg.com.br/arquivos/ids/259143-1000-1000/7702049001675.jpg?v=637172016121530000");
        isCreatedProduct = storeOwner.addProduct(productInformationOne) ? "created." : "not created.";
        System.out.println("Product " + productInformationOne.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id: " + storeOwner.findProductById(1L));
        System.out.println("Product search by name: " + storeOwner.findProductByName("Aguardiente Antiqueño Verde"));

        System.out.println("***** Product 2 *****");
        PackagingDescription packagingDescriptionTwo = new PackagingDescription("Bolsa", 750.0, "ml");
        Category categoryTwo = new Category("Vinos y Licores", false);
        ProductInformation productInformationTwo = new ProductInformation(2L,"Whiskey Jack Daniels Honey", packagingDescriptionTwo, categoryTwo, "Vodka", 107700.0, "https://jumbocolombiafood.vteximg.com.br/arquivos/ids/179058-1000-1000/Jack-Honey-750.jpg?v=636124971865400000");
        isCreatedProduct = storeOwner.addProduct(productInformationTwo) ? "created." : "not created.";
        System.out.println("Product " + productInformationTwo.getId() + " " + isCreatedProduct);
        System.out.println("Product search by id: " + storeOwner.findProductById(2L));
        System.out.println("Product search by name: " + storeOwner.findProductByName("Whiskey Jack Daniels Honey"));
        System.out.println("Product update: " + storeOwner.updateProductInformation(new ProductInformation(2L,"Vodka Smirnoff", packagingDescriptionTwo, categoryTwo, "Vodka", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg")));
        System.out.println("Product search by name: " + storeOwner.findProductByName("Vodka Smirnoff"));

        System.out.println("***** Find and get products *****");
        System.out.println("Products with category: " + storeOwner.queryProductWithSameCategory("Lacteo/Huevos"));
        System.out.println("List of all products: " + storeOwner.getAllProducts());

        System.out.println("***** Removed products *****");
        System.out.println(storeOwner.deleteProduct(newProduct));
        System.out.println(storeOwner.deleteProduct(productInformationOne));
        System.out.println(storeOwner.deleteProduct(productInformationTwo));
    }
}
