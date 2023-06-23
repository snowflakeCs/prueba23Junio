package com.pruebatec.it3.repository;

import com.pruebatec.it3.model.OrderProduct;
import com.pruebatec.it3.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}