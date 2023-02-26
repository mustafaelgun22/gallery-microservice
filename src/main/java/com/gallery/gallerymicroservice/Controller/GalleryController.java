package com.gallery.gallerymicroservice.Controller;

import com.gallery.gallerymicroservice.DTO.GalleryDto;
import com.gallery.gallerymicroservice.Model.Gallery;
import com.gallery.gallerymicroservice.Repository.GalleryRepository;
import com.gallery.gallerymicroservice.Service.GalleryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/gallery")
public class GalleryController {

    private final GalleryService galleryService;

    public GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @PostMapping(value = "/create/")
    public ResponseEntity<GalleryDto> createGallery(@RequestBody Gallery gallery){
        return ResponseEntity.ok(galleryService.createGallery(gallery));
    }
}
