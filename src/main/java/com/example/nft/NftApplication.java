package com.example.nft;


import com.example.nft.configuration.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class NftApplication {

	public static void main(String[] args) {
		SpringApplication.run(NftApplication.class, args);
	}

}
