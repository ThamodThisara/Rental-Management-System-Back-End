package com.icetteam.crm.service;

import com.icetteam.crm.model.Customer;
import com.icetteam.crm.model.Item;

import java.util.List;

public interface ItemService {
    void add(Item item);
    List<Item> getAll();
    void delete(int id);
    Item getByID(int id);
}
