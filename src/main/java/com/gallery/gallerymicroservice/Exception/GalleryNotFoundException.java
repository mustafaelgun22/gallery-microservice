package com.gallery.gallerymicroservice.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GalleryNotFoundException extends RuntimeException{

    public GalleryNotFoundException(String m) {
        super(m);
    }
}
