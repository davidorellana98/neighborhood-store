package com.davidorellana;

import java.util.List;
import java.util.Optional;

public interface UserProductI {

    boolean buyProduct(ProductInformation product);

    List<ProductInformation> getProduct();
}
