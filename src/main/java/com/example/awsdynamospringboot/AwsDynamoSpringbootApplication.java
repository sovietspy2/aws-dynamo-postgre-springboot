package com.example.awsdynamospringboot;

import com.example.awsdynamospringboot.dynamoRepo.ProductRepository;
import com.example.awsdynamospringboot.postgresRepo.PersonRepository;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackageClasses = ProductRepository.class)
@EnableJpaRepositories(basePackageClasses = PersonRepository.class)
public class AwsDynamoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsDynamoSpringbootApplication.class, args);
    }

}
