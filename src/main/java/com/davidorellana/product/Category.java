package com.davidorellana.product;

public class Category {

    private final String nameCategory;
    private final Boolean isRefrigerated;

    public Category(String nameCategory, Boolean isRefrigerated) {
        this.nameCategory = nameCategory;
        this.isRefrigerated = isRefrigerated;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public Boolean isRefrigerated() {
        return isRefrigerated;
    }

    @Override
    public String toString() {
        return "Category {" +
                "category:'" + nameCategory + '\'' +
                ", isRefrigerated:" + isRefrigerated +
                '}';
    }
}
