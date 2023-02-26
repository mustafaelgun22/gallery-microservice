package com.gallery.gallerymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableFeignClients
public class GalleryMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryMicroserviceApplication.class, args);
	}

	@Configuration
	@EnableJpaRepositories(basePackages = "com.gallery.gallerymicroservice.Repository")
	@EntityScan(basePackages = "com.gallery.gallerymicroservice.Model")
	public class JpaConfig {

	}

}
