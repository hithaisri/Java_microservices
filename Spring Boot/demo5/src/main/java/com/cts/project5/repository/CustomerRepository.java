package com.cts.project5.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cts.project5.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
 // List<Customer> findByLname(String lastName);
 // Customer findById(long id);
}
