package com.sda.dianalenter.webshop.repository;

import com.sda.dianalenter.webshop.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
