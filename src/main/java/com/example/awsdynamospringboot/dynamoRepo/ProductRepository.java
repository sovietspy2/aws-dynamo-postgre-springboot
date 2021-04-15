package com.example.awsdynamospringboot.dynamoRepo;

import com.example.awsdynamospringboot.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {

    Optional<Product> findById(String id);
}
