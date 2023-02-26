package com.gallery.gallerymicroservice.client;

import com.gallery.gallerymicroservice.DTO.ProductBarcodeDTO;
import com.gallery.gallerymicroservice.DTO.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service",path = "/v1/product/")
public interface ProductServiceClient {

    @GetMapping(value = "/get_all_products/")
    ResponseEntity<List<ProductDto>> getAllProducts();

    @GetMapping(value = "/{id}/")
    ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

    @GetMapping(value = "/barcode/{barcode}/")
    ResponseEntity<ProductBarcodeDTO> getProductByBarcode(@PathVariable  Long barcode);

}
