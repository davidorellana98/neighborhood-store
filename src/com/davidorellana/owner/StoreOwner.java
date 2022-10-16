package com.davidorellana.owner;

import com.davidorellana.PersonalInformation;
import com.davidorellana.product.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

public class StoreOwner extends PersonalInformation implements ShopProductI {

    private final List<ProductInformation> listProducts = new ArrayList<>();

    public StoreOwner(String name, String lastName, Integer age) {
        super(name, lastName, age);
    }

    @Override
    public Boolean createNewProduct(ProductInformation newProduct) {
        return listProducts.add(newProduct);
    }

    @Override
    public Optional<ProductInformation> findProductByNameAndId(Long id, String name) {
        return listProducts.stream()
                .filter(productId -> productId.getId().equals(id))
                .filter(productName -> productName.getName().equalsIgnoreCase(name))
                .findAny();
    }

    @Override
    public ProductInformation updateProductInformation(Long id, ProductInformation product) {
        if (listProducts.contains(id)) {
            listProducts.add(product);
        }
        return product;
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
}
