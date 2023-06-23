package com.pruebatec.it3.repository;
import com.pruebatec.it3.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}