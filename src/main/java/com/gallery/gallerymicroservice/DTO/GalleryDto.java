package com.gallery.gallerymicroservice.DTO;

import java.util.List;

public class GalleryDto {
    private String name;
    private List<ProductDto> products;

    public GalleryDto(String name, List<ProductDto> productDtos) {
        this.name = name;
        this.products = productDtos;
    }
    public GalleryDto(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<ProductDto> getProducts() {
        return products;
    }
}
