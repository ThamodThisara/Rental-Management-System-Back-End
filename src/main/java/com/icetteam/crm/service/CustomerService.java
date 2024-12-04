package com.icetteam.crm.service;

import com.icetteam.crm.model.Customer;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);
    List<Customer> getAll();
    void delete(int id);
    Customer getByID(int id);
    List<Customer> getByCity(String city);
    List<Customer> getByName(String name);
}
