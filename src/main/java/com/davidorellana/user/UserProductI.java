package com.davidorellana.user;

import com.davidorellana.product.ProductInformation;

import java.util.List;
import java.util.Optional;

public interface UserProductI {

    Optional<ProductInformation> buyProduct(String nameProduct);

    List<ProductInformation> getProduct();
}
