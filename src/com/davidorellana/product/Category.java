package com.davidorellana;

public class Category {

    private final String category;
    private final Boolean isRefrigerated;

    public Category(String category, Boolean isRefrigerated) {
        this.category = category;
        this.isRefrigerated = isRefrigerated;
    }

    public String getCategory() {
        return category;
    }

    public Boolean isRefrigerated() {
        return isRefrigerated;
    }

    @Override
    public String toString() {
        return "Category {" +
                "category:'" + category + '\'' +
                ", isRefrigerated:" + isRefrigerated +
                '}';
    }
}
