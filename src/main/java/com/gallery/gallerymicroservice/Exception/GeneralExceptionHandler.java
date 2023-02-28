package com.gallery.gallerymicroservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(GalleryNotFoundException.class)
    public ResponseEntity<?> handle(GalleryNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionMessage> handle(NotFoundException exception){
        return new ResponseEntity<>(exception.getExceptionMessage(), HttpStatus.NOT_FOUND);
    }
}
