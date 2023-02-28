package com.gallery.gallerymicroservice;

import com.gallery.gallerymicroservice.client.MessageErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
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

	//Bizim oluşturduğumuz error decoder ı kullanması için
	// bu bean i oluşturmamız gerekmektedir.
	@Bean
	public ErrorDecoder errorDecoder(){
		return new MessageErrorDecoder();
	}

}
