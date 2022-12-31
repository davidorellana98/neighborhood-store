package com.davidorellana.user;

import com.davidorellana.PersonalInformation;
import com.davidorellana.product.ProductInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class User extends PersonalInformation implements UserProductI {

    private final Long id;
    private final Boolean isOlderAge;
    private final List<ProductInformation> listProducts = new ArrayList<>();

    public User(Long id, String name, String lastName, Integer age, Boolean isOlderAge) {
        super(name, lastName, age);
        this.id = id;
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
    public Optional<ProductInformation> buyProduct(String nameProduct) {
        return listProducts.stream()
                .filter(product -> product.getName().equalsIgnoreCase(nameProduct))
                .findAny();
    }

    @Override
    public List<ProductInformation> getProduct() {
        return listProducts;
    }
}
