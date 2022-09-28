package com.davidorellana;

import java.util.ArrayList;
import java.util.List;

public class User extends PersonalInformation implements ProductI{

    private final Long id;
    private static Long incrementId = 1L;
    private final Integer age;
    private final Boolean isOlderAge;
    private final List<ProductInformation> listProducts = new ArrayList<>();

    public User(String name, Integer age, Boolean isOlderAge) {
        super(name);
        this.id = incrementId++;
        this.age = age;
        this.isOlderAge = isOlderAge;
    }

    public Long getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User {" +
                "id:" + id +
                ", name:" + super.getName() +
                ", age:" + age +
                ", isOlderAge:" + isOlderAge +
                ", buyProduct:" + List.of(listProducts) +
                '}';
    }

    @Override
    public boolean addProduct(ProductInformation product) {
        return listProducts.add(product);
    }

    @Override
    public List<ProductInformation> getProduct() {
        return listProducts;
    }
}
