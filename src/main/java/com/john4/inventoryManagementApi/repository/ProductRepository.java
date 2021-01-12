package com.john4.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.john4.inventoryManagementApi.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
