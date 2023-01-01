package com.davidorellana.product;

public class PackagingDescription {

    private final String productForm;
    private final Double contentVolume;
    private final MeasureUnit measureUnit;

    public PackagingDescription(String productForm, Double contentVolume, MeasureUnit measureUnit) {
        this.productForm = productForm;
        this.contentVolume = contentVolume;
        this.measureUnit = measureUnit;
    }

    public String getProductForm() {
        return productForm;
    }

    public Double getContentVolume() {
        return contentVolume;
    }

    public MeasureUnit getMeasureUnit() {
        return measureUnit;
    }

    @Override
    public String toString() {
        return "PackagingDescription {" +
                "productForm:'" + productForm + '\'' +
                ", contentVolume:" + contentVolume +
                ", measureUnit:" + measureUnit +
                '}';
    }
}
