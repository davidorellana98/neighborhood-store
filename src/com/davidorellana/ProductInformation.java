package com.davidorellana;

public class ProductInformation extends PersonalInformation {

    private final Long id;
    private static Long incrementId = 1L;
    private final PackagingDescription packagingDescription;
    private final Category category;
    private final String label;
    private final Double price;
    private final String imageUrl;

    public ProductInformation(String name, PackagingDescription packagingDescription, Category category, String label, Double price, String imageUrl) {
        super(name);
        this.id = incrementId++;
        this.packagingDescription = packagingDescription;
        this.category = category;
        this.label = label;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
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
                ", name:" + super.getName() +
                ", packagingDescription:" + packagingDescription +
                ", category:" + category +
                ", label:'" + label + '\'' +
                ", price:'" + price + '\'' +
                ", imageUrl:'" + imageUrl + '\'' +
                '}';
    }
}
