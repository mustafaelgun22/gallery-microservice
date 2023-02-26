package com.gallery.gallerymicroservice.client;

import com.gallery.gallerymicroservice.DTO.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@FeignClient(name = "product-service",path = "/v1/product/")
public interface ProductServiceClient {

    @GetMapping(value = "/get_all_products/")
    public ResponseEntity<List<ProductDto>> getAllProducts();

    @GetMapping(value = "/{id}/")
    public ResponseEntity<ProductDto> getProductById(Long id);

}
