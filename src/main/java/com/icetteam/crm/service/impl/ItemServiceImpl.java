package com.icetteam.crm.service.impl;

import com.icetteam.crm.entity.ItemEntity;
import com.icetteam.crm.model.Customer;
import com.icetteam.crm.model.Item;
import com.icetteam.crm.repository.ItemRepository;
import com.icetteam.crm.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {
    final ItemRepository repository;
    final ModelMapper mapper;
    @Override
    public void add(Item item) {
        repository.save(mapper.map(item, ItemEntity.class));
    }

    @Override
    public List<Item> getAll() {
        ArrayList<Item> items = new ArrayList<>();
        repository.findAll().forEach(entity -> {
            items.add(mapper.map(entity, Item.class));
        });
        return items;
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Item getByID(int id) {
        return mapper.map(repository.findById(id), Item.class);
    }
}
