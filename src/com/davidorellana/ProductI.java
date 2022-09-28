package com.davidorellana;

import java.util.List;

public interface ProductI {

    boolean addProduct(ProductInformation product);

    List<ProductInformation> getProduct();
}
