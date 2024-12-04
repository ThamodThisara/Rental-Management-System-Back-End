package com.icetteam.crm.controller;

import com.icetteam.crm.model.Customer;
import com.icetteam.crm.model.Item;
import com.icetteam.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@CrossOrigin
public class ItemController {
    final ItemService service;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Item item){
        service.add(item);
    }

    @GetMapping("view-all")
    public List<Item> getAll(){
        return service.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void update(@RequestBody Item item){
        service.add(item);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable int id){
        service.delete(id);
    }

    @GetMapping("/get-by-id/{id}")
    public Item getByID(@PathVariable int id){
        return  service.getByID(id);
    }
}
