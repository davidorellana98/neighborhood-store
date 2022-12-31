package com.davidorellana.owner;

import com.davidorellana.PersonalInformation;
import com.davidorellana.product.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class StoreOwner extends PersonalInformation implements ProductServiceI {

    private final List<ProductInformation> listProducts = new ArrayList<>();

    public StoreOwner(String name, String lastName, Integer age) {
        super(name, lastName, age);
    }

    @Override
    public Boolean addProduct(ProductInformation product) {
        return listProducts.add(product);
    }

    @Override
    public Optional<ProductInformation> findProductById(Long id) {
        return listProducts.stream()
                .filter(productId -> productId.getId().equals(id))
                .findAny();
    }

    @Override
    public Optional<ProductInformation> findProductByName(String name) {
        return listProducts.stream()
                .filter(productName -> productName.getName().equalsIgnoreCase(name))
                .findAny();
    }

    @Override
    public ProductInformation updateProductInformation(ProductInformation product) {
        return  listProducts.set(product.getId().intValue(), product);
    }

    @Override
    public List<ProductInformation> queryProductWithSameCategory(String nameCategory) {
        ListIterator<ProductInformation> productListIterator = listProducts.listIterator();
        List<ProductInformation> assistantProduct = new ArrayList<>();
        while (productListIterator.hasNext()) {
            ProductInformation productInformation = productListIterator.next();
            if (productInformation.getCategory().getNameCategory().equalsIgnoreCase(nameCategory)) {
                assistantProduct.add(productInformation);

            }
        }
        return assistantProduct;
    }

    @Override
    public String deleteProduct(ProductInformation product) {
        if (listProducts.isEmpty()) {
            return "Product list empty, there are no products to delete.";
        } else {
            listProducts.remove(product);
            return "Product " + product.getId() + " removed";
        }
    }

    @Override
    public List<ProductInformation> getAllProducts() {
        return listProducts;
    }
}
