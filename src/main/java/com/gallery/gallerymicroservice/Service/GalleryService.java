package com.gallery.gallerymicroservice.Service;

import com.gallery.gallerymicroservice.DTO.GalleryDto;
import com.gallery.gallerymicroservice.Exception.GalleryNotFoundException;
import com.gallery.gallerymicroservice.Model.Gallery;
import com.gallery.gallerymicroservice.Repository.GalleryRepository;
import com.gallery.gallerymicroservice.client.ProductServiceClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class GalleryService {

    private final GalleryRepository galleryRepository;
    private final ProductServiceClient productServiceClient;

    public GalleryService(GalleryRepository galleryRepository, ProductServiceClient productServiceClient) {
        this.galleryRepository = galleryRepository;
        this.productServiceClient = productServiceClient;
    }

    public GalleryDto getAllProductsInGalleryById(long id){
        Gallery gallery = galleryRepository
                .findById(id).
                orElseThrow(()-> new GalleryNotFoundException("Gallery does not exists"));
        return new GalleryDto(
                gallery.getName(),gallery.getIds().stream()
                .map(productServiceClient::getProductById)
                .map(ResponseEntity::getBody)
                .collect(Collectors.toList()));
    }

    public GalleryDto createGallery(Gallery gallery){
        Gallery createdGallery = galleryRepository.save(gallery);
        return new GalleryDto(createdGallery.getName());
    }
}
