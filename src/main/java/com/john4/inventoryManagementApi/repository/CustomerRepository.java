package com.john4.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.john4.inventoryManagementApi.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
