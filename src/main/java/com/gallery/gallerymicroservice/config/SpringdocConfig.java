package com.gallery.gallerymicroservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition
@Configuration
public class SpringdocConfig {

    @Bean
    public OpenAPI customOpenAPI(@Value("${application-description}")String description,
                                 @Value("${application-version}")String version) {
        return new OpenAPI()
                .info(new Info().
                        title("Gallery Microservice").
                        version(version).
                        description(description).
                        license(new License().name("Gallery License")));
    }
}
