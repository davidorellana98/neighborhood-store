package com.davidorellana.owner;

import com.davidorellana.product.ProductInformation;

import java.util.List;
import java.util.Optional;

public interface ProductServiceI {

    Boolean addProduct(ProductInformation product);

    Optional<ProductInformation> findProductById(Long id);

    Optional<ProductInformation> findProductByName(String name);

    ProductInformation updateProductInformation(ProductInformation product);

    List<ProductInformation> queryProductWithSameCategory(String nameCategory);

    String deleteProduct(ProductInformation product);

    List<ProductInformation> getAllProducts();
}
