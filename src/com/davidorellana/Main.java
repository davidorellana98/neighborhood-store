package com.davidorellana;

public class Main {
    public static void main(String[] args) {
        System.out.println("***** Product 1 *****");
        PackagingDescription packagingDescriptionOne = new PackagingDescription("Bolsa", 11000.0, "ml");
        Category categoryOne = new Category("Lacteo/Huevos", true);
        ProductInformation productInformationOne = new ProductInformation("Leche Entera Apina", packagingDescriptionOne, categoryOne, "Leche", 3100.0, "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg");
        User userOne = new User("Luis",13, false);
        System.out.println("Product added: " + userOne.addProduct(productInformationOne));
        System.out.println(userOne.getProduct());

        System.out.println("***** Product 2 *****");
        PackagingDescription packagingDescriptionTwo = new PackagingDescription("Caja", 1000.0, "ml");
        Category categoryTwo = new Category("Vinos y Licores", false);
        ProductInformation productInformationTwo = new ProductInformation("Aguardiente Antiqueño Verde", packagingDescriptionTwo, categoryTwo, "Aguardeinte", 45600.0, "https://metrocolombiafood.vteximg.com.br/arquivos/ids/259143-1000-1000/7702049001675.jpg?v=637172016121530000");
        User userTwo = new User("Jorge",33, true);
        System.out.println("Product added: " + userTwo.addProduct(productInformationTwo));
        System.out.println(userTwo.getProduct());

        System.out.println("***** Product 3 *****");
        PackagingDescription packagingDescriptionThree = new PackagingDescription("Bolsa", 60.0, "gr");
        Category categoryThree = new Category("Despensa", false);
        ProductInformation productInformationThree = new ProductInformation("Jengibre El Rey", packagingDescriptionThree, categoryThree, "Condimentos, caldos y sal", 2100.0, "https://exitocol.vtexassets.com/arquivos/ids/1977248-1200-auto?width=1200&height=auto&aspect=true");
        User userThree = new User("Camila", 45, true);
        System.out.println("Product added: " + userThree.addProduct(productInformationThree));
        System.out.println(userThree.getProduct());

    }
}
