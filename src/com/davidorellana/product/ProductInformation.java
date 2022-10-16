package com.davidorellana.product;

public class ProductInformation  {

    private final String name;
    private final Long id;
    private final PackagingDescription packagingDescription;
    private final Category category;
    private final String label;
    private final Double price;
    private final String imageUrl;

    public ProductInformation(Long id, String name, PackagingDescription packagingDescription, Category category, String label, Double price, String imageUrl) {
        this.name = name;
        this.id = id;
        this.packagingDescription = packagingDescription;
        this.category = category;
        this.label = label;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String  getName() {
        return name;
    }

    public PackagingDescription getPackagingDescription() {
        return packagingDescription;
    }

    public Category getCategory() {
        return category;
    }

    public String getLabel() {
        return label;
    }

    public Double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "ProductInformation {" +
                "id:" + id +
                ", name:" + name +
                ", packagingDescription:" + packagingDescription +
                ", category:" + category +
                ", label:'" + label + '\'' +
                ", price:'" + price + '\'' +
                ", imageUrl:'" + imageUrl + '\'' +
                '}';
    }
}
