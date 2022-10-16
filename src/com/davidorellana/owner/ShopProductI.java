package com.davidorellana.owner;

import com.davidorellana.product.ProductInformation;

import java.util.List;
import java.util.Optional;

public interface ShopProductI {

    Boolean createNewProduct(ProductInformation newProduct);

    Optional<ProductInformation> findProductByNameAndId(Long id, String name);

    ProductInformation updateProductInformation(Long id, ProductInformation product);

    List<ProductInformation> queryProductWithSameCategory(String nameCategory);
}
