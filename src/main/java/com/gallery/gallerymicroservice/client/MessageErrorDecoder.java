package com.gallery.gallerymicroservice.client;

import com.gallery.gallerymicroservice.Exception.ExceptionMessage;
import com.gallery.gallerymicroservice.Exception.NotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MessageErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder errorDecoder = new Default();
    @Override
    public Exception decode(String s, Response response) {
        ExceptionMessage exceptionMessage = null;
        try(InputStream body = response.body().asInputStream()){
            exceptionMessage = new ExceptionMessage(
                    response.status(),
                    IOUtils.toString(body,StandardCharsets.UTF_8),response.request().url());
        }catch (IOException exception){
            return new Exception(exception.getMessage());

        }
        if (response.status() == 404) {
            return new NotFoundException(exceptionMessage);
        }
        return errorDecoder.decode(s, response);

    }
}
