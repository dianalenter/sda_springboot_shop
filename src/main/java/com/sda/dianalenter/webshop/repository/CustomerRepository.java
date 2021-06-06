package com.sda.dianalenter.webshop.repository;

import com.sda.dianalenter.webshop.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
