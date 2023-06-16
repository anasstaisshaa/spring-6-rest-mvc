package com.anastasiiatkachuk.springframework.spring6restmvc.services;

import com.anastasiiatkachuk.springframework.spring6restmvc.model.Beer;
import com.anastasiiatkachuk.springframework.spring6restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> listCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateById(UUID customerId, Customer customer);

    void deleteById(UUID customerId);

    void patchBeerById(UUID customerId, Customer customer);
}

