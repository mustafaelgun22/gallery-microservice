package com.gallery.gallerymicroservice.DTO;

import java.util.List;

public class GalleryDto {
    private String name;
    private List<ProductDto> productDtos;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductDtos(List<ProductDto> productDtos) {
        this.productDtos = productDtos;
    }

    public String getName() {
        return name;
    }

    public List<ProductDto> getProductDtos() {
        return productDtos;
    }

    public GalleryDto(String name, List<ProductDto> productDtos) {
        this.name = name;
        this.productDtos = productDtos;
    }
    public GalleryDto(String name) {
        this.name = name;
    }
}
