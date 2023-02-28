package com.gallery.gallerymicroservice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
    private ExceptionMessage message;

    public NotFoundException(ExceptionMessage message) {
        this.message = message;
    }

    public ExceptionMessage getExceptionMessage() {
        return this.message;
    }
}
