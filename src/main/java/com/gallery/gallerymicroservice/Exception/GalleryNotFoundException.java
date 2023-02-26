package com.gallery.gallerymicroservice.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GalleryNotFoundException extends RuntimeException{

    public GalleryNotFoundException(String m) {
        super(m);
    }
}
