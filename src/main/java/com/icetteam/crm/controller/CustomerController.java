package com.icetteam.crm.controller;

import com.icetteam.crm.model.Customer;
import com.icetteam.crm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    final CustomerService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Customer customer){
        service.add(customer);
    }

    @GetMapping("view-all")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody Customer customer){
        service.add(customer);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/get-by-id/{id}")
    public Customer getByID(@PathVariable int id){
        return  service.getByID(id);
    }

    @GetMapping("/get-by-city/{city}")
    public List<Customer> getByCity(@PathVariable String city){
        return  service.getByCity(city);
    }

    @GetMapping("/get-by-name/{name}")
    public List<Customer> getByName(@PathVariable String name){
        return  service.getByName(name);
    }
}
