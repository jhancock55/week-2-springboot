package com.john4.inventoryManagementApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.john4.inventoryManagementApi.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
