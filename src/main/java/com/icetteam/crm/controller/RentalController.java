package com.icetteam.crm.controller;

import com.icetteam.crm.model.Item;
import com.icetteam.crm.model.Rental;
import com.icetteam.crm.service.RentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rental")
@RequiredArgsConstructor
@CrossOrigin
public class RentalController {
    final RentalService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Rental rental){
        service.add(rental);
    }

    @GetMapping("view-all")
    public List<Rental> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody Rental rental){
        service.add(rental);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/get-by-id/{id}")
    public Rental getByID(@PathVariable int id){
        return  service.getByID(id);
    }
}
