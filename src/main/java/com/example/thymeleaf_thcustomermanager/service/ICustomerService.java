package com.example.thymeleaf_thcustomermanager.service;

import com.example.thymeleaf_thcustomermanager.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
