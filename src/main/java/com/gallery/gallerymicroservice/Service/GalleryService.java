package com.gallery.gallerymicroservice.Service;

import com.gallery.gallerymicroservice.DTO.GalleryDto;
import com.gallery.gallerymicroservice.Repository.GalleryRepository;
import com.gallery.gallerymicroservice.client.ProductServiceClient;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {

    private final GalleryRepository galleryRepository;
    private final ProductServiceClient productServiceClient;

    public GalleryService(GalleryRepository galleryRepository, ProductServiceClient productServiceClient) {
        this.galleryRepository = galleryRepository;
        this.productServiceClient = productServiceClient;
    }
}
