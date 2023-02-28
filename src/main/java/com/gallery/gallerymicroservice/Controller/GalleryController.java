package com.gallery.gallerymicroservice.Controller;

import com.gallery.gallerymicroservice.DTO.AddProductToGalleryRequest;
import com.gallery.gallerymicroservice.DTO.GalleryDto;
import com.gallery.gallerymicroservice.Model.Gallery;
import com.gallery.gallerymicroservice.Service.GalleryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add/")
    public ResponseEntity<GalleryDto> addProductToGallery(@RequestBody AddProductToGalleryRequest request){
        return ResponseEntity.ok(galleryService.addProductToGallery(request));
    }

    @GetMapping("/{id}/")
    public ResponseEntity<GalleryDto> getGalleryById(@PathVariable Long id){
        return ResponseEntity.ok(galleryService.getAllProductsInGalleryById(id));
    }
}
