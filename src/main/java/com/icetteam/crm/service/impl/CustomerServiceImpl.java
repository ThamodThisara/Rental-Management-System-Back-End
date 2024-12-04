package com.icetteam.crm.service.impl;

import com.icetteam.crm.entity.CustomerEntity;
import com.icetteam.crm.model.Customer;
import com.icetteam.crm.repository.CustomerRepository;
import com.icetteam.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepository repository;
    final ModelMapper mapper;
    @Override
    public void add(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        ArrayList<Customer> customers = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Customer getByID(int id) {
        return mapper.map(repository.findById(id), Customer.class);
    }

    @Override
    public List<Customer> getByCity(String city) {
        ArrayList<Customer> customers =  new ArrayList<>();
        repository.findByCity(city).forEach(entity ->{
            customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }

    @Override
    public List<Customer> getByName(String name) {
        ArrayList<Customer> customers = new ArrayList<>();
        repository.findByName(name).forEach(entity -> {
            customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }
}
