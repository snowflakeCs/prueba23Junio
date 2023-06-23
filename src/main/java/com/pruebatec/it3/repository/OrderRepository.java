package com.pruebatec.it3.repository;
import com.pruebatec.it3.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}