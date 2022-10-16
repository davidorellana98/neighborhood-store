package com.davidorellana;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User extends PersonalInformation implements UserProductI{

    private final Long id;
    private static Long incrementId = 1L;
    private final Boolean isOlderAge;
    private final List<ProductInformation> listProducts = new ArrayList<>();

    public User(String name, String lastName, Integer age, Boolean isOlderAge) {
        super(name, lastName, age);
        this.id = incrementId++;
        this.isOlderAge = isOlderAge;
    }

    public Long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "User {" +
                "id:" + id +
                ", name:" + super.getName() +
                ", age:" + super.getAge() +
                ", isOlderAge:" + isOlderAge +
                ", buyProduct:" + List.of(listProducts) +
                '}';
    }

    @Override
    public boolean buyProduct(ProductInformation product) {
        return listProducts.add(product);
    }

    @Override
    public List<ProductInformation> getProduct() {
        return listProducts;
    }
}
